package dbmodel.generic;

import jetbrains.dbmodel.core.DbmsBehaviour;
import jetbrains.dbmodel.core.NamingCase;
import jetbrains.dbmodel.core.SizeUnits;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Map;

/**
 * Generic (undefined) database.
 **/
public class GeneBehaviour implements DbmsBehaviour
{



    public GeneBehaviour()
    {
    }


    @NotNull
    @Override
    public NamingCase getNamingCase()
    {
        return NamingCase.MIXED;
    }

    @Override
    public char getNamingOpenQuote()
    {
        return '"';
    }

    @Override
    public char getNamingCloseQuote()
    {
        return '"';
    }

    @Override
    public boolean isNormalNameCharacter(char c)
    {
        return Character.isUnicodeIdentifierPart(c);
    }

    @NotNull
    @Override
    public SizeUnits getDefaultVarcharUnits()
    {
        return SizeUnits.CHARS;
    }

    @NotNull
    @Override
    public Map<String,SizeUnits> getDefaultSizeUnits()
    {
        return Collections.emptyMap();
    }
}
