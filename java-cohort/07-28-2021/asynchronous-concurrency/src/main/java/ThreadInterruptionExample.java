/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/28/21 11:38 AM
 */
public class ThreadInterruptionExample {
    public static void main(String[] args) {
        Runnable runnable = new ThreadInterruptionExample()::someMethodWereReferencing;
        Thread t = new Thread(runnable);
        t.start();
        ThreadUtils.sleep(5000);

        System.out.println("TIME TO STOP THESE CHILDREN PROCESSES FROM RUNNING AROUND");
        t.interrupt();
    }

    public void someMethodWereReferencing() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("I AM RUNNING!");
        }
    }
}
