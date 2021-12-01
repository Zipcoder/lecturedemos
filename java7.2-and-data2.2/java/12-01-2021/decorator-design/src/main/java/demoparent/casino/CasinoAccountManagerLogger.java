package demoparent.casino;

import demoparent.casino.utils.AnsiColor;
import demoparent.casino.utils.IOConsole;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/1/21 11:52 AM
 */
public class CasinoAccountManagerLogger implements CasinoAccountManagerInterface, Serializable {
    private IOConsole console;
    private CasinoAccountManagerInterface accountManager;

    public CasinoAccountManagerLogger() {
        this(new IOConsole(AnsiColor.RED), new CasinoAccountManager());
    }

    public CasinoAccountManagerLogger(IOConsole ioConsole, CasinoAccountManagerInterface accountManager) {
        this.console = ioConsole;
        this.accountManager = accountManager;
    }

    @Override
    public void add(CasinoAccount casinoAccount) {
        console.println("I am adding a new account");
        console.println("The name of the new user is [ %s ]", casinoAccount.getUsername());
        console.println("The password of the new user is [ %s ]", casinoAccount.getPassword());
        accountManager.add(casinoAccount);
        console.println("A new casino account has been added");
    }

    @Override
    public void remove(CasinoAccount casinoAccount) {
        accountManager.remove(casinoAccount);
    }

    @Override
    public CasinoAccount get(String username, String password) {
        return accountManager.get(username, password);
    }

    @Override
    public Collection<CasinoAccount> getAll() {
        return accountManager.getAll();
    }
}
