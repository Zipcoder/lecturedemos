import java.util.Arrays;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/2/21 2:16 PM
 */
public class ArrayDemonstration {
    public static void declareAnArray() {
        int[] a;
        int b[]; // possible... but GARBAGE
    }

    public static void initializePrimitiveIntArray() {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            int i1 = myArray[i];
            System.out.println(i1);
        }
    }

    public static void initializeNonPrimitiveIntArray() {
        Integer[] myArray = new Integer[10];
        for (int i = 0; i < myArray.length; i++) {
            Integer integer = myArray[i];
            System.out.println(integer);
        }
    }

    public static void initializeNonPrimitiveIntArrayBrokenUpMore() {
        int numberOfElements = 10;
        Integer[] myArray = new Integer[numberOfElements];
        for (int i = 0; i < myArray.length; i++) {
            Integer element = myArray[i];
            System.out.println(element);
        }
    }

    public static void forEachLoopExample() {
        int numberOfElements = 10;
        Integer[] myArray = new Integer[numberOfElements];
        for (Integer element : myArray) {
            System.out.println(element);
        }
    }

    public static void iteratingThroughAStringOnEveryCharacter() {
        String someStr = "The quick brown fox jumps over the lazy dog";
        String[] splitArray = someStr.split(""); // split the string on every character
        int splitArrayLength = splitArray.length;
        int someStrLength = someStr.length();

        boolean areEqualLengths = splitArrayLength == someStrLength;
        System.out.println("Some string length = " + someStrLength);
        System.out.println("Split array length = " + splitArrayLength);
        System.out.println("Are Equal Lengths = " + areEqualLengths);

        System.out.println("Printing out each character...");
        for (int i = 0; i < splitArray.length; i++) {
            String currentCharacter = splitArray[i];
            System.out.println(currentCharacter);
        }
    }

    public static void iteratingThroughAStringOnEverySpace() {
        String someStr = "The quick brown fox jumps over the lazy dog";
        String[] splitArray = someStr.split(" "); // iterating through every word
        int splitArrayLength = splitArray.length;
        int someStrLength = someStr.length();

        boolean areEqualLengths = splitArrayLength == someStrLength;
        System.out.println("Some string length = " + someStrLength);
        System.out.println("Split array length = " + splitArrayLength);
        System.out.println("Are Equal Lengths = " + areEqualLengths);

        System.out.println("Printing out each word...");
        for (String currentCharacter : splitArray) {
            System.out.println(currentCharacter);
        }
    }

    public static void generalForEachLoopSyntax() {
        // for (DataType variableName : iterableVariableName) {
        //      statement1
        //      statement2
        //      ...
        //      statementN
        // }
    }

    public static void namedArrayDeclaration() {
        int[] smallPrimes = new int[]{2, 3, 5, 7, 11, 13};
    }

    public static void anonymousArrayDeclaration() {
        String arrayAsString = Arrays.toString(new int[]{2, 3, 5, 7, 11, 13});
    }

    public static void variableReferenceConfusion() {
        int[] smallPrimes = new int[]{2, 3, 5, 7, 11, 13};
        int[] smallPrimesPseudoClone = new int[]{2, 3, 5, 7, 1, 15};
        smallPrimesPseudoClone = smallPrimes;
        smallPrimesPseudoClone[0] = 1;

        int firstElementSmallPrimes = smallPrimes[0];
        int firstElementSmallPrimesPseudoClone = smallPrimesPseudoClone[0];
        System.out.println(firstElementSmallPrimes);
        System.out.println(firstElementSmallPrimesPseudoClone);

        int smallPrimesAddress = smallPrimes.hashCode();
        int smallPrimesPseudoCloneAddress = smallPrimesPseudoClone.hashCode();
        System.out.println(smallPrimesAddress);
        System.out.println(smallPrimesPseudoCloneAddress);
    }


    public static void arrayCloning() {
        int[] smallPrimes = new int[]{2, 3, 5, 7, 11, 13};
        int[] smallPrimesPseudoClone = Arrays.copyOf(smallPrimes, 2);
        System.out.println(smallPrimes);
        System.out.println(smallPrimesPseudoClone);
    }

    public static void printingAnArray() {
        int[] smallPrimes = new int[]{2, 3, 5, 7, 11, 13};
        int[] smallPrimesPseudoClone = Arrays.copyOf(smallPrimes, 2);
        String valueToPrintSmallPrimes = Arrays.toString(smallPrimes);
        String valueToPrintSmallPrimesClone = Arrays.toString(smallPrimesPseudoClone);

        System.out.println(valueToPrintSmallPrimes);
        System.out.println(valueToPrintSmallPrimesClone);
    }

    public static void sortAnArray() {
        String[] pangram = "The quick Brown Fox Jumps Over The Lazy Dog".split(" ");
        Arrays.sort(pangram);
        String pangramString = Arrays.toString(pangram);
        System.out.println(pangramString);
    }


    public static void multiDimensional() {
        String[] pangram1 = "The quick Brown Fox Jumps Over The Lazy Dog".split(" ");
        String[] pangram2 = "The five boxing wizards jump quickly".split(" ");
        String[] pangram3 = "A wizard's job is to vex chumps quickly in fog".split(" ");
        String[][] pangrams1 = new String[][]{pangram1, pangram2, pangram3};
        String[][] pangrams2 = new String[][]{pangram1, pangram2, pangram3};
        String[][] pangrams3 = new String[][]{pangram1, pangram2, pangram3};

        String[][][] pangrams3D = new String[][][]{pangrams1, pangrams2, pangrams3};

        String[] firstPangram = pangrams1[0];
        String[] secondPangram = pangrams1[1];
        String[] thirdPangram = pangrams1[2];

        String pangramStr1 = Arrays.toString(firstPangram);
        String pangramStr2 = Arrays.toString(secondPangram);
        String pangramStr3 = Arrays.toString(thirdPangram);

        System.out.println(pangramStr1);
        System.out.println(pangramStr2);
        System.out.println(pangramStr3);
        System.out.println("Printing the 3D thing");

        for (int i = 0; i < pangrams3D.length; i++) {
            String[][] array2D = pangrams3D[i];
            System.out.println("\tPrinting the 2D thing");
            for (int j = 0; j < array2D.length; j++) {
                String[] array1D = array2D[j];
                System.out.println("\t\tPrinting the 1D thing");
                for (int k = 0; k < array1D.length; k++) {
                    String element = array1D[k];
                    System.out.println("\t\t\t" + element);
                }
            }
        }
    }


    public static void main(String[] args) {
        multiDimensional();
    }
}
