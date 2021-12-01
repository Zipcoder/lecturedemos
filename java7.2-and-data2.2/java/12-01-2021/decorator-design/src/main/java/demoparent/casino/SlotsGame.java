package demoparent.casino;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:53 AM
 */
public class SlotsGame implements GameInterface {
    @Override
    public void run() {
        System.out.println("Welcome to " + getClass().getSimpleName());
    }
}
