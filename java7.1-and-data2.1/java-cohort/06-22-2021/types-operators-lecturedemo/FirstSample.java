public class FirstSample { // this is a single line comment
    static int z;

    /**
     * multiline comments wheeee
     */
    // view the link below to discover how to generate javadocs
    // https://stackoverflow.com/questions/1843072/intellij-generate-javadoc-for-methods-and-classes
    public static void main(String[] args) {
        java.math.BigInteger bi = null;
        float f = 0.001F;
        // int newValueWithNotCleverName = f;
        int x;
        int y = z + 10; // valid
        // int t = x + 10; // invalid
        // System.out.println("The value of x is " + x);
        System.out.println("The value of y is " + y);
        System.out.println("The value of z is " + z);
        x = 10;
        char someCharacter = '\u0000';
        char maxCharacter = '\uFFFF';
        System.out.println("The value of minChar = " + someCharacter);
        System.out.println("The value of macChar = " + maxCharacter);

        Boolean b = true;
        Boolean c = false;
        Boolean d = null;

    }

    public static void ternaryOperators() {
        int x = 10;
        int y = 15;

        boolean b = x > y;
        String result = b ? "Heck yeah!" : "Oh helll no";

        System.out.println(result);
    }

    public static void ternaryOperatorsExpanded() {
        int x = 10;
        int y = 15;

        boolean b = x > y;
        String result;
        if(b) {
            result = "Heck yeah!";
        } else {
            result =  "Oh helll no";
        }

        System.out.println(result);
    }

    public static void postIncrementOperators() {
        int x = 10;
        x+=5; // x = x + 5;
        x ++;
        System.out.println(x);
    }

    public static void preIncrementOperators() {
        int x = 10;
        x+=5; // x = x + 5;
        int c = x-- - --x;
        System.out.println(x);
    }

    public static void primitiveConversion() {
        double x = 9.997;
        int nx = (int) x;
        double z = (double)nx;
        System.out.println(z);
    }

    // declaration
    // initialization
    // assignment

    public static void validVariableDeclarationBecauseOfScope() {
        System.out.println("The value of z is " + z);
        if(true) {
            int x; // declaration of some variable x with no value
            x = 10; // assignment & initialization of some variable, x whose value is 10
            x = 11; // assignment (NOT initialization) of some variable, x whose value is 11
        }
        int x = 10;
        System.out.println("Hey this is the second method!");
    }

    public static void invalidVariableDeclarationBecauseOfScope() {
        System.out.println("The value of z is " + z);
        int x = 10;
        if(true) {
            // int x; // does not compile upon removing the parent comment to this nested comment
        }
        System.out.println("Hey this is the second method!");
    }
}