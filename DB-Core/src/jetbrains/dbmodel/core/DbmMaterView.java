package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public abstract class DbmMaterView extends DbmLikeTable
{

    public DbmMaterView(final @NotNull DbmSchema schema)
    {
        super(schema);
    }

}
