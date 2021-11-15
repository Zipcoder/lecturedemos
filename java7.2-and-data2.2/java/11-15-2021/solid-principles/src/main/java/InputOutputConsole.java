import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 9:36 AM
 */
public class InputOutputConsole {
    public void print(Object valueToPrint) {
        // todo
    }

    public void println(Object valueToPrint) {
        print(valueToPrint + "\n");
    }

    public String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public Double getDoubleInput(String prompt) {
        String userInputAsString = getStringInput(prompt);
        return Double.parseDouble(userInputAsString);
    }

    public Integer getIntegerInput(String prompt) {
        return getDoubleInput(prompt).intValue();
    }
}
