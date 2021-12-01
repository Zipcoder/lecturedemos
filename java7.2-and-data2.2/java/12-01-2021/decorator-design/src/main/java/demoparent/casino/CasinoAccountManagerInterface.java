package demoparent.casino;

import java.util.Collection;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/1/21 11:50 AM
 */
public interface CasinoAccountManagerInterface {
    void add(CasinoAccount casinoAccount);

    void remove(CasinoAccount casinoAccount);

    CasinoAccount get(String username, String password);

    Collection<CasinoAccount> getAll();
}
