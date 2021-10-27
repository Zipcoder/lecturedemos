import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 10/27/21 1:43 PM
 */
public class MainApplication {
    int y = 0;
    private static int x = 15;


    public static void main(String[] args) {
        switchCaseExample2();
    }

    public static void nestedWhileLoop() {
        outerLoop:
        while(true) {
            do {
                if(true) {
                  break outerLoop;
                }
            }while(true);
        }
    }

    public static void switchCaseExample2() {
        String someSwitchable = "apple";
        switch (someSwitchable) {
            case "apple":
            case "tomato":
                System.out.println("It was apple or tomato!");
                break;

            case "orange":
                System.out.println("It was orange!");
                break;

            default:
                System.out.println("Everything is a lie; it's all false! It's none of the numbers");
        }
    }
    public static void switchCaseExample1() {
        int someSwitchable = 10;
        switch (someSwitchable) {
            case 10:
            case 1:
                System.out.println("It was ten or one!");
                break;

            case 2:
                System.out.println("It was two!");
                break;

            default:
                System.out.println("Everything is a lie; it's all false! It's none of the numbers");
        }
    }

    public static void determinateForLoop2() { // performs identically to determinateWhileLoop()
        for (int counter = 0, limit = 10; counter < limit; counter++) {
            System.out.println("The current value of the counter is " + counter);

            for (int nestedCounter = 0; nestedCounter < 10; nestedCounter++) {
                System.out.println("The current value of the nestedCounter is " + nestedCounter);
            }
        }
    }

    public static void determinateForLoop1() { // performs identically to determinateWhileLoop1()
        for (int counter = 0, limit = 10; counter < limit; counter++) {
            System.out.println("The current value of the counter is " + counter);
        }
    }

    public static void determinateWhileLoop1() { // performs identically to determinateForLoop1()
        int counter = 0;
        int limit = 10;
        while (counter < limit) {
            System.out.println("The current value of the counter is " + counter);
            counter++;
        }
    }

    public static void doWhileStatement1() {
        Scanner scanner = new Scanner(System.in);
        Integer ageAsInteger = null;
        do {
            System.out.println("Enter your age");
            String ageAsString = scanner.nextLine();
            ageAsInteger = Integer.parseInt(ageAsString);
        } while (ageAsInteger < 18);
    }

    public static void whileStatement3() {
        Scanner scanner = new Scanner(System.in);
        Integer ageAsInteger = 0;
        System.out.println("Enter your age");
        String ageAsString = scanner.nextLine();
        while (ageAsInteger < 18) {
            System.out.println("Enter your age");
            ageAsString = scanner.nextLine();
            ageAsInteger = Integer.parseInt(ageAsString);
        }
    }


    public static void doWhileStatement2() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = someCondition != false; // evaluates to false
        do { // continuously execute until this condiiton is false
            someCondition = a > b;
            System.out.println("It's true!");
            a = a + 1;
        } while (someCondition);
    }


    public static void whileStatement2() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = someCondition != false; // evaluates to false
        while (!someCondition) { // continuously execute until this condiiton is false
            someCondition = a > b;
            System.out.println("It's true!");
            a = a + 1;
        }
    }

    public static void whileStatement1() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = someCondition != false; // evaluates to false
        while (!someCondition) {
            System.out.println("It's true!");
            a = a + 1;
        }
    }


    public static void conditionalStatement1() {
        int a = 10;
        int b = 15;
        boolean someCondition = a > b; // evaluates to false
        if (someCondition) {
            System.out.println("Hello world");
        }
    }

    public static void conditionalStatement2() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = b < c; // evaluates to true
        if (!someCondition) {
            if (someOtherCondition) {
                System.out.println("Hello world");
            }
        }
    }


    public static void conditionalStatement3() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = b < c; // evaluates to true
        if (!someCondition && someOtherCondition) {
            System.out.println("Hello world");
        }
    }


    public static void conditionalStatement4() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = someCondition == false; // evaluates to true
        if (someOtherCondition) {
            System.out.println("Hello world");
        }
    }


    public static void conditionalStatement5() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = someCondition != false; // evaluates to false
        if (!someOtherCondition) { // true
            System.out.println("Hello world");
        } else {
            System.out.println("Good bye world!");
        }
    }


    public static void conditionalStatement6() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = someCondition != false; // evaluates to false
        if (someOtherCondition) { // false
            System.out.println("Hello world");
        }
        // this is NOT occurring independently of the if clause above
        else if (someCondition) { // false
            System.out.println("Good bye world!");
        }

        System.out.println("Yay");

    }


    public static void conditionalStatement7() {
        int a = 10;
        int b = 15;
        int c = 20;
        boolean someCondition = a > b; // evaluates to false
        boolean someOtherCondition = someCondition != false; // evaluates to false
        if (someOtherCondition) { // false
            System.out.println("Hello world");
        }

        // this is occurring independently of the if clause above
        if (!someOtherCondition && someCondition) { // false
            System.out.println("Good bye world!");
        }

        System.out.println("Yay");

    }


    public static void firstFewExamples() {
        int y = 1;

        {
            int x = 10;
            System.out.println(y);
            {
                System.out.println(x);
            }
        }

        int x = 11;

        System.out.println(MainApplication.x); // 15
        System.out.println(x); // 11
        System.out.println("Hello world");
        System.out.println(y); // 1
    }
}
