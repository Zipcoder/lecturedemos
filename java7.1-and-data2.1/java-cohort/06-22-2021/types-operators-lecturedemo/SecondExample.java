public class SecondExample {
    private int age; // this variable is used for declaring a person's age

    /**
     * The purpose of this method is to expose the main entry point for the application
     */
    public static void main(String[] args) {
        /*
         * this is a multiline comment
         * (not used for documentation)
         */
        System.out.print("Good bye cruel world");
        System.out.println("Hello");

        // program statements
    }

    public static String ternaryOperatorExample() {
        String yourName = "Hello";
        String output = "";
        if(yourName == "Hello") {
            output = "Hey there!";
        } else {
            output = "Naw, idk you";
        }
        output = yourName.equals("Hello") ? "Hey there!" : "Naw, idk you";
        return output;
    }

    public static void enumeratedTypeExample() {
        Long highestLongValue = Long.MAX_VALUE;
    }
}