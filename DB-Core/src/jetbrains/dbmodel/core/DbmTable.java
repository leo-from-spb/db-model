package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public class DbmTable extends DbmLikeTable
{

    private TableOrganization organization;


    public DbmTable(final @NotNull DbmSchema schema)
    {
        super(schema);
    }



    public TableOrganization getOrganization()
    {
        return organization;
    }

    public void setOrganization(TableOrganization organization)
    {
        this.organization = organization;
    }
}
