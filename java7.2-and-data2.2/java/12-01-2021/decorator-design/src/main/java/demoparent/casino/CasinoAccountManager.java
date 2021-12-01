package demoparent.casino;

import demoparent.casino.utils.AnsiColor;
import demoparent.casino.utils.IOConsole;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/1/21 11:32 AM
 */
public class CasinoAccountManager implements CasinoAccountManagerInterface {
    private List<CasinoAccount> accountList;

    public CasinoAccountManager() {
        this(new ArrayList<>());
    }

    public CasinoAccountManager(List<CasinoAccount> accountList) {
        this.accountList = accountList;
    }

    @Override
    public void add(CasinoAccount casinoAccount) {
        accountList.add(casinoAccount);
    }

    @Override
    public void remove(CasinoAccount casinoAccount) {
        accountList.remove(casinoAccount);
    }

    @Override
    public CasinoAccount get(String username, String password) {
        return accountList
                .stream()
                .filter(casinoAccount ->
                        casinoAccount.getUsername().equals(username) &&
                        casinoAccount.getPassword().equals(password))
                .findFirst()
                .get();
    }

    @Override
    public Collection<CasinoAccount> getAll() {
        return accountList;
    }
}
