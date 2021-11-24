package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;
import com.github.zipcodewilmington.utils.IOConsoleSingleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class CasinoAccountManager {
    private IOConsoleSingleton ioConsoleSingleton = IOConsoleSingleton.INSTANCE;
    private IOConsole ioConsole = new IOConsole(AnsiColor.CYAN);
    private List<CasinoAccount> list = new ArrayList<>();

    /**
     * @param accountName     name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount getAccount(String accountName, String accountPassword) {
        ioConsole.println("Fetching account with name [ %s ] and password [ %s ]", accountName, accountPassword);
        return list
                .stream()
                .filter(casinoAccount ->
                                casinoAccount.getAccountName().equals(accountName) &&
                                casinoAccount.getPassword().equals(accountPassword))
                .findFirst()
                .get();
    }

    /**
     * logs & creates a new `ArcadeAccount`
     *
     * @param accountName     name of account to be created
     * @param accountPassword password of account to be created
     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public CasinoAccount createAccount(String accountName, String accountPassword) {
        ioConsole.println("Creating account with name [ %s ] and password [ %s ]", accountName, accountPassword);
        return new CasinoAccount(accountName, accountPassword);
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     *
     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */
    public void registerAccount(CasinoAccount casinoAccount) {
        ioConsole.println("Registering account", casinoAccount);
        list.add(casinoAccount);
    }
}
