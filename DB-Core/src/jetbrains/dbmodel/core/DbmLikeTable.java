package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public abstract class DbmLikeTable extends DbmObject
{
    @NotNull
    private DbmSchema schema;


    protected DbmLikeTable(final @NotNull DbmSchema schema)
    {
        super(schema.model);
        this.schema = schema;
    }


    @NotNull
    public DbmSchema getSchema()
    {
        return schema;
    }
}
