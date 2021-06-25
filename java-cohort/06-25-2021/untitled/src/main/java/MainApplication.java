import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/25/21 2:00 PM
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        // TODO - Define this
        printFileContents();
    }

    public static void printFileContents() throws IOException {
        String filePathString = "myfile.txt";
        String charsetName = "UTF-8";
        Path filePath = Paths.get(filePathString);
        Scanner fileScanner = new Scanner(filePath, charsetName);
        String result = "";
        while (fileScanner.hasNextLine()) {
            String nextLineInFile = fileScanner.nextLine();
            result += nextLineInFile;
        }
        System.out.println(result);
    }

    public static void printWithPrecisionExample4() {
        System.out.printf("%8,.2f", 10000.0 / 3.0); // 3,333.33
    }

    public static void printWithPrecisionExample3() {
        String name = "leon";
        int age = 29;
        System.out.printf("Hello, %s. Next year, you'll be %d", name, age);
    }

    public static void printWithPrecisionExample2() {
        double quotient = 100.0 / 3.0;
        int numberOfSpacesToAllocate = 15;
        int numberOfDecimalsToSpecify = 4;
        String formatter = "%" + numberOfSpacesToAllocate + "." + numberOfDecimalsToSpecify + "f"; // break down of string specified on line 30
        System.out.print(String.format(formatter, quotient)); // logically identical to line below
        System.out.printf(formatter, quotient); // logically identical to line above
    }

    public static void printWithPrecisionExample1() {
        double x = 100.0 / 3.0;
        double y = 100000.0 / 3.0;
        System.out.println("X without precision = " + x);

        System.out.print("X with precision = ");
        System.out.printf("%15.2f", x); // 3333.33

        System.out.println("\nY without precision = " + y);

        System.out.print("Y with precision = ");
        System.out.printf("%15.3f", y); // 3333.33
    }

    public static void printDayOfWeek() {
        String manipulateThis = getDayOfWeek();
        manipulateThis = manipulateThis.toUpperCase();
        System.out.println(manipulateThis);
    }


    public static String getDayOfWeek() {
        String today = "monday";
        switch (today.toLowerCase()) {
            case "Monday":
                return "First day of the week!";

            case "Tuesday":
                return "Second day of the week!";

            case "Wednesday":
                return "Third day of the week!";

            case "Thursday":
                return "Fourth day of the week!";


            case "Friday":
                return "Fifth day of the week!";

            default:
                return "Thas not even a day stoopid";
        }
    }
}
