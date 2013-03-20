package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 *
 **/
public abstract class DbmView extends DbmLikeTable
{

    @Nullable
    private String codeText;

    boolean withCheckOption;


    public DbmView(final @NotNull DbmSchema schema)
    {
        super(schema);
    }


    @Nullable
    public String getCodeText()
    {
        return codeText;
    }

    public void setCodeText(final @Nullable String codeText)
    {
        this.codeText = codeText;
    }

    public boolean isWithCheckOption()
    {
        return withCheckOption;
    }

    public void setWithCheckOption(boolean withCheckOption)
    {
        this.withCheckOption = withCheckOption;
    }
}
