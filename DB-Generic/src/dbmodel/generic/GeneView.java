package dbmodel.generic;

import jetbrains.dbmodel.core.DbmTable;
import jetbrains.dbmodel.core.DbmView;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public class GeneView extends DbmView
{
    public GeneView(@NotNull GeneSchema schema)
    {
        super(schema);
    }


    @Override
    public GeneColumn createColumn()
    {
        return new GeneColumn(this);
    }
}
