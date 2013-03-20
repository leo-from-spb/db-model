package jetbrains.dbmodel.core;

import org.jetbrains.annotations.NotNull;

import java.util.Set;

/**
 * Describes DBMS behaviour.
 * In other words, describes differences of this DBMS from other.
 **/
public interface DbmsBehaviour
{

    NamingCase getNamingCase();

    char getNamingOpenQuote();

    char getNamingCloseQuote();

    boolean isNormalNameCharacter(char c);

}
