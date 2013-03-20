package jetbrains.dbmodel.oracle;

import jetbrains.dbmodel.core.DbmTable;
import jetbrains.dbmodel.core.DbmView;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public final class OraView extends DbmView
{

    public OraView(@NotNull OraSchema schema)
    {
        super(schema);
    }

}
