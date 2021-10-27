/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/23/21 10:13 AM
 */
public class MainApplication { // CamelCasing
    public static void main(String[] args) {
        ifElseStatementBrokenDown();
    }

    public static void conversationalScopes() {
        int n = 5;
        while (true) { // while scope
            if (true) { // if scope

            }
        }
    }

    public static void raymondQuestionTest() {
        // declaration
        int x;

        // assignment (also an initialization)
        x = 5;

        // declaration & assignment (a type of initialization)
        int y = 5;

        // declaration & then assignment (a type of initialization)
        int z; // declaration
        z = 5; // initialization (also, an assignment)
        z = 6; // re-assignment
    }

    public static void test() {
        int n = 10;
        {
            n = 7; // not valid to redeclare same variable
            int k = 10;
            System.out.println(n);
            System.out.println(k);
        } // k is only defined up to here
        System.out.println(n);
        // System.out.println(k); // this is commented out so that it compiles upon cloning
    }

    public static void myIfStatement1() {
        if (5 > 1) {
            System.out.println("hello world");
            System.out.println("hey world");
        }
    }

    public static void ifElseStatement() {
        boolean is5GreaterThan1 = (5 > 1);
        String name = "Leon";
        if(is5GreaterThan1) {
            System.out.println(name);
        } else {
            System.out.println("Not greater than 1");
        }
    }

    public static void ifThenIfNotStatement() {
        boolean is5GreaterThan1 = (5 > 1);
        String name = "Leon";
        if(is5GreaterThan1) {
            System.out.println(name);
        }
        if(!is5GreaterThan1) {
            System.out.println("Not greater than 1");
        }
    }


    public static void ifElseStatementBrokenDown() {
        // given
        int age = 5;
        int allowedAge = 18;
        boolean isOldEnough = age > allowedAge;
        String isOldEnoughString = "Leon is old enough";
        String isNotOldEnoughString = "Leon is not old enough";

        // when
        if(isOldEnough) { //then
            System.out.println(isOldEnoughString);
        } else { // then
            System.out.println(isNotOldEnoughString);
        }
    }




}
