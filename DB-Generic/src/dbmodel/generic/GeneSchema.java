package dbmodel.generic;

import jetbrains.dbmodel.core.*;
import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public class GeneSchema extends DbmSchema
{

    public GeneSchema(@NotNull DbModel model)
    {
        super(model);
    }


    @NotNull
    @Override
    public GeneTable createTable()
    {
        return new GeneTable(this);
    }

    @NotNull
    @Override
    public GeneView createView()
    {
        return new GeneView(this);
    }

    @NotNull
    @Override
    public GeneMaterView createMaterView()
    {
        return new GeneMaterView(this);
    }
}
