package dbmodel.generic;

import jetbrains.dbmodel.core.DbmMaterView;
import jetbrains.dbmodel.core.DbmView;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public class GeneMaterView extends DbmMaterView
{
    public GeneMaterView(@NotNull GeneSchema schema)
    {
        super(schema);
    }


    @Override
    public GeneColumn createColumn()
    {
        return new GeneColumn(this);
    }
}
