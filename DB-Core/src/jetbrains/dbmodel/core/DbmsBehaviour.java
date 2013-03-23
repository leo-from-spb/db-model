package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

/**
 * Describes DBMS behaviour.
 * In other words, describes differences of this DBMS from other.
 **/
public interface DbmsBehaviour
{

    /**
     * The case of saved name if the name is not quoted.
     * @return preserved case.
     */
    @NotNull
    NamingCase getNamingCase();

    char getNamingOpenQuote();

    char getNamingCloseQuote();

    boolean isNormalNameCharacter(char c);

    @NotNull
    SizeUnits getDefaultVarcharUnits();

    @NotNull
    Map<String,SizeUnits> getDefaultSizeUnits();

}
