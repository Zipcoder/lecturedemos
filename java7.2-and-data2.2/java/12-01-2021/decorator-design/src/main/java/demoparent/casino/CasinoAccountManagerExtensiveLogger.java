package demoparent.casino;

import demoparent.casino.utils.AnsiColor;
import demoparent.casino.utils.IOConsole;

import java.util.Collection;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/1/21 12:03 PM
 */
public class CasinoAccountManagerExtensiveLogger implements CasinoAccountManagerInterface {
    private CasinoAccountManagerInterface logger = new CasinoAccountManagerLogger();

    @Override
    public void add(CasinoAccount casinoAccount) {
        new IOConsole(AnsiColor.BLUE).println("Hey check this out!");
        logger.add(casinoAccount);
    }

    @Override
    public void remove(CasinoAccount casinoAccount) {
        logger.remove(casinoAccount);
    }

    @Override
    public CasinoAccount get(String username, String password) {
        return logger.get(username, password);
    }

    @Override
    public Collection<CasinoAccount> getAll() {
        return logger.getAll();
    }
}
