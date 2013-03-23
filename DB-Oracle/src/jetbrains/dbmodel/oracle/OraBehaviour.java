package jetbrains.dbmodel.oracle;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedSet;
import jetbrains.dbmodel.core.DbmsBehaviour;
import jetbrains.dbmodel.core.NamingCase;
import jetbrains.dbmodel.core.SizeUnits;
import jetbrains.utils.CaseInsensitiveStringComparator;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

/**
 * Oracle RDBMS behaviour.
 **/
public class OraBehaviour implements DbmsBehaviour
{

    //// ORACLE RDBMS PROPERTIES \\\\

    private static final Set<String> nativeDataTypes =
            ImmutableSortedSet.<String>orderedBy(CaseInsensitiveStringComparator.instance)
                .add("number")
                .add("float")
                .add("date")
                .add("char")
                .add("varchar")
                .add("varchar2")
                .add("clob")
                .add("nchar")
                .add("nvarchar")
                .add("nvarchar2")
                .add("nclob")
                .add("blob")
                .build();

    private static final Map<String,SizeUnits> defaultSizeUnits =
            ImmutableSortedMap.<String,SizeUnits>orderedBy(CaseInsensitiveStringComparator.instance)
                .put("number", SizeUnits.DIGITS)
                .put("char", SizeUnits.BYTES)
                .put("varchar", SizeUnits.BYTES)
                .put("varchar2", SizeUnits.BYTES)
                .put("nchar", SizeUnits.BYTES)
                .put("nvarchar", SizeUnits.BYTES)
                .put("nvarchar2", SizeUnits.BYTES)
                .build();


    //// TUNING STATE \\\\

    public final int majorVersion;


    //// INITIALISATION \\\\

    public OraBehaviour(int majorVersion)
    {
        this.majorVersion = majorVersion;
    }



    //// IMPLEMENTATION \\\\


    @Override @NotNull
    public NamingCase getNamingCase()
    {
        return NamingCase.UPPER;
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
        // TODO isNormalNameCharacter(char c)
        return Character.isUnicodeIdentifierPart(c);
    }

    @Override @NotNull
    public SizeUnits getDefaultVarcharUnits()
    {
        return SizeUnits.BYTES;
    }

    @Override @NotNull
    public Map<String, SizeUnits> getDefaultSizeUnits()
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
