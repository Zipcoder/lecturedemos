package demoparent.streams;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 2:21 PM
 */
public class Wallet {
    private final Double randomApr;
    private int balance;

    public Wallet(Double randomApr) {
        this.randomApr = randomApr;
    }

    public void increaseBalance(int balance) {
        this.balance += balance;
    }
}
