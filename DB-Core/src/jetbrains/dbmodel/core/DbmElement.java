package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

/**
 * Base class for all objects of the database model.
 **/
public abstract class DbmElement
{
    @NotNull
    public final DbModel model;


    protected DbmElement(final @NotNull DbModel model)
    {
        this.model = model;
    }


    @NotNull
    protected DbmsBehaviour getDbmsBehaviour()
    {
        return model.getDbmsBehaviour();
    }

}
