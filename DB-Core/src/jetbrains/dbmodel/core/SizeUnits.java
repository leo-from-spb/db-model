package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

/**
 *
 **/
public enum SizeUnits
{

    NONE (""),
    DIGITS (""),
    BYTES ("byte"),
    CHARS ("char");


    @NotNull
    public final String suffix;


    private SizeUnits(final @NotNull String suffix)
    {
        this.suffix = suffix;
    }
}
