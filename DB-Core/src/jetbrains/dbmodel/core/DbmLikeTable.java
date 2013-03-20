package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 *
 **/
public abstract class DbmLikeTable extends DbmObject
{
    @NotNull
    private DbmSchema schema;

    @NotNull
    private final List<DbmColumn> columns = new ArrayList<DbmColumn>(8);



    protected DbmLikeTable(final @NotNull DbmSchema schema)
    {
        super(schema.model);
        this.schema = schema;
    }


    public abstract DbmColumn createColumn();


    @NotNull
    public DbmSchema getSchema()
    {
        return schema;
    }


    @NotNull
    public List<DbmColumn> getColumns()
    {
        return columns;
    }
}
