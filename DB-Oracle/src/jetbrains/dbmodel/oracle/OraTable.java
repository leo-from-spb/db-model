package jetbrains.dbmodel.oracle;

import jetbrains.dbmodel.core.DbModel;
import jetbrains.dbmodel.core.DbmSchema;
import jetbrains.dbmodel.core.DbmTable;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public final class OraTable extends DbmTable
{

    public OraTable(@NotNull OraSchema schema)
    {
        super(schema);
    }

}
