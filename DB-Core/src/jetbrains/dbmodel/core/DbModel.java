package jetbrains.dbmodel.core;

import org.jetbrains.annotations.*;

/**
 *
 **/
public abstract class DbModel
{
    @NotNull
    private DbmsBehaviour dbmsBehaviour;


    @NotNull
    public DbmsBehaviour getDbmsBehaviour()
    {
        return dbmsBehaviour;
    }

    public void setDbmsBehaviour(@NotNull final DbmsBehaviour dbmsBehaviour)
    {
        this.dbmsBehaviour = dbmsBehaviour;
    }


}
