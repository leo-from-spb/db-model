package jetbrains.dbmodel.oracle;

import jetbrains.dbmodel.core.*;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public final class OraSchema extends DbmSchema
{

    public OraSchema(@NotNull DbModel model)
    {
        super(model);
    }


    @NotNull
    @Override
    public DbmTable createTable()
    {
        return new OraTable(this);
    }

    @NotNull
    @Override
    public DbmView createView()
    {
        return new OraView(this);
    }

    @NotNull
    @Override
    public DbmMaterView createMaterView()
    {
        return new OraMaterView(this);
    }
}
