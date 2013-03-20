package jetbrains.dbmodel.core;

import org.jetbrains.annotations.*;

/**
 * Base class for named stored objects of the database model.
 **/
public abstract class DbmObject extends DbmElement
{

    /**
     * Human-friendly name.
     */
    @Nullable
    private String name;

    /**
     * The name is quoted in the database.
     */
    private boolean nameQuoted;


    protected DbmObject(@NotNull DbModel model)
    {
        super(model);
    }

    protected DbmObject(final @NotNull DbModel model, final @Nullable String name, boolean nameQuoted)
    {
        super(model);
        this.name = name;
        this.nameQuoted = nameQuoted;
    }


    public void setName(final @Nullable String name, boolean quoted)
    {
        this.name = name;
        this.nameQuoted = quoted;
    }

    @Nullable
    public String getName()
    {
        return name;
    }

    public boolean hasName()
    {
        return name != null;
    }

    public boolean isNameQuoted()
    {
        return nameQuoted;
    }


    @Nullable
    public String getNameForScript()
    {
        if (nameQuoted)
        {
            DbmsBehaviour behaviour = model.getDbmsBehaviour();
            return behaviour.getNamingOpenQuote() + name + behaviour.getNamingCloseQuote();
        }
        else
        {
            return name;
        }
    }

    public void setNameForScript(final @Nullable String name)
    {
        if (name == null || name.length() == 0)
        {
            this.name = null;
            this.nameQuoted = false;
        }
        else
        {
            int n = name.length();
            DbmsBehaviour behaviour = model.getDbmsBehaviour();
            char c1 = name.charAt(0),
                 c2 = name.charAt(n-1);
            this.nameQuoted = c1 == behaviour.getNamingOpenQuote() && c2 == behaviour.getNamingCloseQuote() && n >= 2;
            this.name = nameQuoted ? name.substring(1, n-1) : name;
        }
    }


    @Nullable
    public String getNameForMetadata()
    {
        DbmsBehaviour behaviour = model.getDbmsBehaviour();
        if (nameQuoted)
        {
            return name;
        }
        else
        {
            switch (behaviour.getNamingCase())
            {
                case LOWER: return name.toLowerCase();
                case UPPER: return name.toUpperCase();
                default: return name;
            }
        }
    }

    public void setNameForMetadata(final @Nullable String name)
    {
        if (name == null || name.length() == 0)
        {
            this.name = null;
            this.nameQuoted = false;
        }
        else
        {
            DbmsBehaviour behaviour = model.getDbmsBehaviour();
            boolean lowers = false, uppers = false, quoted = false;
            for (int i = 0, n = name.length(); i < n; i++)
            {
                char c = name.charAt(i);
                boolean normal = behaviour.isNormalNameCharacter(c);
                lowers |= Character.isLowerCase(c);
                uppers |= Character.isUpperCase(c);
                quoted |= !normal || i == 0 && !lowers && !uppers;
            }

            NamingCase namingCase = behaviour.getNamingCase();
            quoted |= namingCase == NamingCase.LOWER && uppers || namingCase == NamingCase.UPPER && lowers;

            nameQuoted = quoted;
            if (quoted)
            {
                this.name = name;
            }
            else
            {
                this.name = humanizeName(name);
            }
        }
    }

    @NotNull
    private String humanizeName(final @NotNull String name)
    {
        // TODO implement humanizeName()
        return name;
    }


}
