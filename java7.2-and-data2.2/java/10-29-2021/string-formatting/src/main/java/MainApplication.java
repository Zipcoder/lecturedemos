import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 10/29/21 2:20 PM
 */
public class MainApplication {
    public static void forLoopVsForEachLoop() {
        String[] phraseArray = new String[]{"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        System.out.println("Starting the for-each loop...");
        for (String element : phraseArray) {
            System.out.print(element);
        }

        System.out.println("\nStarting the determinate loop...");
        for (int i = 0; i < phraseArray.length; i++) {
            String element = phraseArray[i];
            System.out.println(element);
        }
    }

    public static void equalsIgnoreCaseExample1() {
        String s1 = "HELLO";
        String s2 = "hellooo";

        boolean areStringsEqual = s1.equals(s2);
        boolean areStringsEqualIgnoreCase1 = s1.toLowerCase().equals(s2.toLowerCase());
        boolean areStringsEqualIgnoreCase2 = s1.equalsIgnoreCase(s2);
        System.out.println(areStringsEqual);
        System.out.println(areStringsEqualIgnoreCase1);
        System.out.println(areStringsEqualIgnoreCase2);
    }

    public static void equalsIgnoreCaseExample2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to hear a [song] or a hear a [jingle]?");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("SONG")) {
            System.out.println("I'm blue and da ba di ba da dah and da bi dee da ba dah");
        }

        if (userInput.equalsIgnoreCase("jingle")) {
            System.out.println("Nationwide is on your side");
        }
    }


    public static void replaceAllExample1() {
        String vowels = "aeiou";
        String phrase = "The quick brown fox jumps over the lazy dog";
        char[] vowelsCharArray = vowels.toCharArray();
        for (int i = 0; i < vowelsCharArray.length; i++) {
            Character currentVowel = vowelsCharArray[i];
            phrase = phrase.replaceAll(currentVowel.toString(), "");
        }
        System.out.println(phrase);
    }


    public static void replaceAllExample2() {
        String vowels = "aeiou";
        String phrase = "The quick brown fox jumps over the lazy dog";
        phrase = phrase.toLowerCase().replaceAll("the", "thee");
        System.out.println(phrase);
    }

    public static void splitExample() {
        String[] phraseArray1 = new String[]{"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String delimiter = " "; // the separating character is a space
        String[] phraseArray2 = "The quick brown fox jumps over the lazy dog".split(delimiter);
        String[] myAddress = "1200 N Dupont Highway, Dover, DE, Suite 120, United States".split(", ");
        String streetAddress = myAddress[0];
        String city = myAddress[1];
        String state = myAddress[2];
        String suite = myAddress[3];
        String country = myAddress[4];
        System.out.println("Street is " + streetAddress);
        System.out.println("City is " + city);
        System.out.println("State is " + state);
        System.out.println("Suite is " + suite);
        System.out.println("Country is " + country);
    }

    public static void joinExample() {
        String[] array = {"The", "Following", "Elements"};
        String delimiter = ",";
        String result = String.join(delimiter, array);
        System.out.println(result);
    }

    public static void main(String[] args) {
        joinExample();
    }
}