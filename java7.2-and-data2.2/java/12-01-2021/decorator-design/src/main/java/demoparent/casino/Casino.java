package demoparent.casino;

import demoparent.casino.utils.AnsiColor;
import demoparent.casino.utils.IOConsole;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:50 AM
 */
public class Casino {
    public static void main(String[] args) {
        CasinoAccountManagerInterface casinoAccountManager = new CasinoAccountManagerExtensiveLogger();
        IOConsole console = new IOConsole(AnsiColor.CYAN);
        String userDecision = null;
        do {
            console.println("From here you can enter any of the following");
            userDecision = console.getStringInput("[register], [select]");
            if ("register".equals(userDecision)) {
                String username = console.getStringInput("Enter your username");
                String password = console.getStringInput("Enter your password");
                casinoAccountManager.add(new CasinoAccount(0L, username, password));
            }
            if ("select".equals(userDecision)) {
                String username = console.getStringInput("Enter your username");
                String password = console.getStringInput("Enter your password");
                CasinoAccount casinoAccount = casinoAccountManager.get(username, password);
                console.println("The account that was retrieved is %s", casinoAccount);
            }
        } while (!"quit".equals(userDecision));
    }
}
