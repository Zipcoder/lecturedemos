/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 9:35 AM
 */
public class CalculatorDisplay {
    private InputOutputConsole console;

    public String getMainMenu() {
        console.println("Welcome to my calculator main menu");
        console.println("From here you can do any of the following:");
        return console.getStringInput("[add], [subtract], [multiply], [divide]");
    }

    public String getStringInput(String prompt) {
        return console.getStringInput(prompt);
    }

    public String getUserName() {
        return console.getStringInput("Enter your name:");
    }

    public InputOutputConsole getConsole() {
        return null;
    }
}
