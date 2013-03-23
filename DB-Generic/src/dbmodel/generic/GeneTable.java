package dbmodel.generic;

import jetbrains.dbmodel.core.DbmTable;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public class GeneTable extends DbmTable
{
    public GeneTable(@NotNull GeneSchema schema)
    {
        super(schema);
    }


    @Override
    public GeneColumn createColumn()
    {
        return new GeneColumn(this);
    }
}
