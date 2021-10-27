/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/28/21 11:32 AM
 */
public class MyNewProcess extends Thread{
    @Override
    public void run() {
        System.out.println("Hey!");
        System.out.println("Look at me go!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm a new thread!");
        System.out.println("I'm on the loose!");
    }
}
