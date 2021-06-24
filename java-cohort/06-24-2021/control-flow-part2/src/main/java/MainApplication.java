import java.util.Locale;
import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/24/21 3:11 PM
 */
public class MainApplication {
    public static void main(String[] args) {
        fetchingUserInput();
    }

    public static void myFirstWhileLoop() {
        while (5 > 3) System.out.println("hello");
    }

    public static void myFirstDoWhileLoop() {
        do System.out.println("hello"); while (5 > 3);
    }

    public static void mySecondDoWhileLoop() {
        do System.out.println(System.nanoTime()); while (5 > 3);
    }


    public static void whileLoopPrintingUpTo100() {
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
    }


    public static void forLoopPrintingUpTo100() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void nestedForLoop() {
        for (int outerLoopCounter = 0; outerLoopCounter < 100; outerLoopCounter++) {
            System.out.println("================================");
            System.out.println("Outer loop is set to = " + outerLoopCounter);

            for (int innerLoopCounter = 0; innerLoopCounter < 10; innerLoopCounter++) {
                System.out.println("\tInner loop is set to = " + innerLoopCounter);
            }
        }
    }

    public static void ifElseIfElseIfElseIfElseIfElse() {
        String today = "friday";
        if ("monday".equals(today)) {
            System.out.println("First day of the week!");
        } else if ("tuesday".equals(today)) {
            System.out.println("Second day of the week!");
        } else if ("Wednesday".equals(today)) {
            System.out.println("Third day of the week!");
        } else if ("Thursday".equals(today)) {
            System.out.println("Fourth day of the week!");
        } else if ("Friday".equals(today)) {
            System.out.println("Fifth day of the week!");
        } else {
            System.out.println("Thas not even a day stoopid");
        }
    }


    public static void switchCaseExample() {
        String today = "monday";
        switch (today.toLowerCase(Locale.ROOT)) {
            case "Monday":
                System.out.println("First day of the week!");
                break;

            case "Tuesday":
                System.out.println("Second day of the week!");
                break;

            case "Wednesday":
                System.out.println("Third day of the week!");
                break;

            case "Thursday":
                System.out.println("Fourth day of the week!");
                break;

            case "Friday":
                System.out.println("Fifth day of the week!");
                break;

            default:
                System.out.println("Thas not even a day stoopid");
                break;

        }
    }


    public static void caseLabelStatementForSwitchCases() {
        String month = "June";
        String today = "monday";

        outerSwitchCase:
        switch (today.toLowerCase(Locale.ROOT)) {
            case "Monday":

                innerSwitchCase:
                switch (month) {
                    case "January":
                        System.out.println("It's the first day of the week");
                        System.out.println("It's first month of the year");
                        break outerSwitchCase;

                    case "February":

                }
                break;
        }
    }

    public static void caseLabelStatementForLoops() {
        int i =0;
        while(true) {
            System.out.println(i);
            i++;
            if(i == 100) {
                break;
            }
        }
    }

    public static void fetchingUserInput() {
        int sum = 0;
        int goal = 10;
        Integer userInput = null;
        Scanner keyboardScanner = new Scanner(System.in); // instantiation
        while (sum < goal)
        {
            System.out.print("Enter a number: ");
            userInput = keyboardScanner.nextInt();
            if (userInput < 0){
                System.out.println("What're you doing?");
                System.out.println("Enter a number like a normal person");
                continue;
            }
            sum += userInput; // not executed if n < 0
        }
    }
}
