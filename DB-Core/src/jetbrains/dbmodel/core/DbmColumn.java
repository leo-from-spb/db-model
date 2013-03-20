package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 *
 **/
public class DbmColumn extends DbmObject
{

    @NotNull
    private DbmLikeTable parent;

    @Nullable
    private String dataType;

    private int size;

    private int scale;

    @NotNull
    private SizeUnits sizeUnits;

    private boolean mandatory;

    @Nullable
    private String defaultExpression;



    public DbmColumn(final @NotNull DbmLikeTable parent)
    {
        super(parent.model);
        this.parent = parent;
    }


    @NotNull
    public DbmLikeTable getParent()
    {
        return parent;
    }


    public void assignDataType(final @NotNull String dataType, int size, int scale, final @NotNull SizeUnits sizeUnits)
    {
        this.dataType = dataType;
        this.size = size;
        this.scale = scale;
        this.sizeUnits = sizeUnits;
    }


    public void clearDataType()
    {
        this.dataType = null;
        this.size = 0;
        this.scale = 0;
        this.sizeUnits = SizeUnits.NONE;
    }


    @Nullable
    public String getDataType()
    {
        return dataType;
    }

    public int getSize()
    {
        return size;
    }

    public int getScale()
    {
        return scale;
    }

    @NotNull
    public SizeUnits getSizeUnits()
    {
        return sizeUnits;
    }


    public boolean isMandatory()
    {
        return mandatory;
    }

    public void setMandatory(boolean mandatory)
    {
        this.mandatory = mandatory;
    }

    @Nullable
    public String getDefaultExpression()
    {
        return defaultExpression;
    }

    public void setDefaultExpression(@Nullable String defaultExpression)
    {
        this.defaultExpression = defaultExpression;
    }
}
