/**
 * @author git-leon
 * @version 1.0.0
 * @date 10/28/21 4:38 PM
 */
public class MainApplication {

    public static void integerWrapperClass() {
        int x = 10;
        Integer y = new Integer(x);
    }


    public static void charWrapperClass() {
        char c = 'c';
        Character character = new Character(c);
    }

    public static void characterArrayWrapperClass() {
        char[] characterArray = new char[]{'a', 'b', 'c'};
        String s = new String(characterArray); // initialization
        s = s.toUpperCase(); // to persist the change of upper casing, we must reassign the value to the copy
        System.out.println(s);
    }

    public static void createString() {
        String s1 = new String();
        String s2 = "";
        String s3 = "Hello world";
        String s4 = "I'm sorry for what \"I said\" when I was hungry!";
        System.out.println(s4);
    }

    public static void createStringWithConstructor() {
        char[] charArray = new char[]{'a', 'b', 'c'};
        byte[] byteArray = new byte[]{0, 1, 34, 56};
        String someStringToUseUponConstruction = "The quick brown";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append("World");

        String charArrayString = new String(charArray);
        String byteArrayString = new String(byteArray);
        String stringString = new String(someStringToUseUponConstruction);
        String stringStringBuilder = new String(stringBuilder);

        System.out.println(charArrayString);
        System.out.println(byteArrayString);
        System.out.println(stringString);
        System.out.println(stringStringBuilder);
    }


    public static void newLineCharacterDemo() {
        System.out.println(new StringBuffer("Hello\nWorld"));
    }

    public static void parseDataTypeToString() {
        int x = 10;
        char c = 'h';
        long l = 137893127892L;
        String s1 = Integer.toString(x);
        String s2 = Character.toString(c);
        String s3 = Long.toString(l);
        String s4 = String.valueOf(l);
    }

    public static void getNumberOfCharacterInString() {
        String emptyChar = "\u0000";
        String myPangram = "The quick brown fox jumps over the lazy dog";
        int numberOfCharacters = myPangram.length();
        char lastCharacter = myPangram.charAt(numberOfCharacters - 1);
        System.out.println(lastCharacter);
        System.out.println(numberOfCharacters);
    }

    public static void subString() {
        String myPangram = "The\tquick\nbrown fox jumps over the lazy dog";
        String myPangramSubStringFrom3ToEnd = myPangram.substring(3);
        String myPangramSubStringFrom3To10 = myPangram.substring(3, 10);
        String myPangramSubStringFrom3To10Trimmed = myPangramSubStringFrom3To10.trim();
        System.out.println(myPangramSubStringFrom3ToEnd);
        System.out.println(myPangramSubStringFrom3To10);
        System.out.println(myPangramSubStringFrom3To10Trimmed); // removes tabs, new lines, and spaces
    }


    public static void compareToString() {
        String s1 = "The quick brown fox";
        String s2 = "Jumps over the lazy dog";
        int comparisonValue = s1.compareTo(s2);
        System.out.println(comparisonValue);

    }

    public static void concatenationExample() {
        String s1 = "The quick brown fox\n";
        String s2 = "Jumps over the lazy dog";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }


    public static void joinExample() {
        String s1 = "The";
        String s2 = "quick";
        String s3 = "brown";
        String s4 = "fox";

        String result = String.join("\n", s1, s2, s3, s4);
        System.out.println(result);
    }


    public static void concatenateObjectsToString() {
        char someRandomAssObject = 5;
        String s1 = "Did it concatenate? " + someRandomAssObject;
        System.out.println(s1);
    }

    public static void equality() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "World";

        boolean isS1EqualToS2 = s1.equals(s2); // do s1 and s2 contain the same contents?
        boolean isS1TheSameAsS2 = s1 == s2;// do s1 and s2 occupy the same location in memory
        boolean isS3EqualToS1 = s3.equals(s1);
        boolean isS3TheSameAsS1 = s3 == s1;

        System.out.println(isS1EqualToS2);
        System.out.println(isS1TheSameAsS2);
        System.out.println(isS3EqualToS1);
        System.out.println(isS3TheSameAsS1);
    }

    public static void nullString1() {
        String s1 = null;
        String s2 = s1.concat("Hello world");
        System.out.println(s2);
    }

    public static void nullString2() {
        String s1 = null;
        String s2 = s1 + "Hello world";
        System.out.println(s2);
    }


    public static void nullString3() {
        String s1 = null;
        String s2;
        if (s1 != null) {
            s2 = s1.concat("Hello world");
        } else {
            s2 = s1 + "Hello world";
        }
        System.out.println(s2);
    }

    public static void objectToStringMethod() {
        Integer x = 10;
        x.toString();
        Object someRandomAssObject = new Object();
        System.out.println(someRandomAssObject);
    }

    public static void createCharArrayWithString() {
        String charArrayString = "abc";
        char[] charArray = charArrayString.toCharArray();
        System.out.println(charArray);

    }


    public static void main(String[] args) {
        createCharArrayWithString();
    }
}
