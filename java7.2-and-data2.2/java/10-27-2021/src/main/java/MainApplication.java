/**
 * @author git-leon
 * @version 1.0.0
 * @date 10/27/21 11:17 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }


    public static void validVariableDeclarationBecauseOfScope() {
        System.out.println("The value of z is " + 0);
        if (true) {
            int x; // declaration of some variable x with no value
            x = 10; // assignment & initialization of some variable, x whose value is 10
            x = 11; // assignment (NOT initialization) of some variable, x whose value is 11
        }
        int x = 10;
        System.out.println("Hey this is the second method!");
    }
}
