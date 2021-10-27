/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/28/21 11:38 AM
 */
public class ThreadUtils {
    public static void sleep(Integer milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
