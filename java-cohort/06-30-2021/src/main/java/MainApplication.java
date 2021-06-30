import java.util.ArrayList;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/30/21 9:32 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        nestedArrayExample();
    }

    public static void particularlyTypedLists() {
        char primitiveC = 'c';
        Character nonPrimitiveC = new Character(primitiveC);
        char[] arrayOfChar = {'a','b','c'};
        Character[] arrayOfCharacters = new Character[]{'a','b','c'};
        String stringOfCharacters = new String(arrayOfCharacters);
        String stringOfChars= new String(arrayOfChar);
        ArrayList<Integer> nameOfIntegerList = new ArrayList<>();
        ArrayList<String> nameOfStringList = new ArrayList<String>();
    }

    public static void wrapperTypes() {
        Character someCharValue = 'c';
        someCharValue.toString();
        Integer someIntValue = 10;
        String someStringRepresentation = someIntValue.toString();

        Object[] anotherOne = new Object[1];
        Object[] objArray = new Object[]{
                new Integer(1),
                new Integer(3),
                new Double(5.7),
                new String("Hello world"),
                new Character('c'),
                new Object[1],
                anotherOne
        };
        ArrayList intArrList = new ArrayList();

    }

    public static void nestedArrayExample() {
        int[][] magicSquare = new int[3][3];
        magicSquare = new int[][]{
                {16, 3, 2, 13}, // magicSquare[0];
                {5, 10, 11, 8}, // magicSquare[1];
                {9, 6, 7, 12}, // magicSquare[2];
                {4, 15, 14, 1} // magicSquare[3];
        };

        int[] magicSquareFirstRow = magicSquare[0];
        System.out.println("Magic Square First Row = " + magicSquareFirstRow);


        int firstValueFirstArray = magicSquare[0][0];
        int secondValueFirstArray = magicSquare[0][1];
        int firstValueSecondArray = magicSquare[1][0];


        System.out.println("[0][0] = " + firstValueFirstArray);
        System.out.println("[0][1] = " + secondValueFirstArray);
        System.out.println("[1][0] = " + firstValueSecondArray);
    }

    public static void arrayPointerExample() {
        int[] smallPrimes = new int[]{2, 3, 5, 7, 11, 13};
        int[] intArray = new int[]{1, 2, 34, 5};
        smallPrimes = intArray;

        int firstValInSmallPrimes = smallPrimes[0];
        int firstValInIntArray = intArray[0];
        boolean firstValuesAreEqual = firstValInIntArray == firstValInSmallPrimes;
    }

    public static void exampleOfMainMethod(String[] args) {
        String firstArgument = args[0];
        System.out.println("The first argument is = " + firstArgument);
        for (String argument : args) {
            System.out.println(argument);
        }
    }
}
