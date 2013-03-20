package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 *
 **/
public abstract class DbmSchema extends DbmObject
{

    @NotNull
    private List<DbmTable> tables = new ArrayList<DbmTable>();

    @NotNull
    private List<DbmView> views = new ArrayList<DbmView>();

    @NotNull
    private List<DbmMaterView> materViews = new ArrayList<DbmMaterView>();




    public DbmSchema(@NotNull DbModel model)
    {
        super(model);
    }


    @NotNull
    public abstract DbmTable createTable();

    @NotNull
    public abstract DbmView createView();

    @NotNull
    public abstract DbmMaterView createMaterView();



    @NotNull
    public List<DbmTable> getTables()
    {
        return tables;
    }

    @NotNull
    public List<DbmView> getViews()
    {
        return views;
    }

    @NotNull
    public List<DbmMaterView> getMaterViews()
    {
        return materViews;
    }
}
