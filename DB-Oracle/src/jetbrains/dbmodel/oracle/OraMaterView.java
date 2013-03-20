package jetbrains.dbmodel.oracle;

import jetbrains.dbmodel.core.DbmColumn;
import jetbrains.dbmodel.core.DbmMaterView;
import jetbrains.dbmodel.core.DbmTable;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public final class OraMaterView extends DbmMaterView
{

    public OraMaterView(@NotNull OraSchema schema)
    {
        super(schema);
    }


    @Override
    public DbmColumn createColumn()
    {
        return new DbmColumn(this);
    }

}
