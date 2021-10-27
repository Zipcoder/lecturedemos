/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/14/21 10:31 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        IOConsole console = new IOConsole();
        double age = console.getDoubleInput("Enter the average age to get married in the US");
        System.out.println(age);
        test("Hey");
    }

    public static String test(String input) {
        String returnValue = input + "hello world";
        return test(returnValue);
    }
}
