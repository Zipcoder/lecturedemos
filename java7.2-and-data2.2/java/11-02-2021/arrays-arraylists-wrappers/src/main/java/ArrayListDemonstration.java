import java.util.ArrayList;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/2/21 3:36 PM
 */
public class ArrayListDemonstration {
    public static void initializeArrayListBadExample() {
        ArrayList badExample1 = new ArrayList<>();
        ArrayList badExample2 = new ArrayList();

        badExample1.add(1);
        badExample1.add("Yup");
        badExample1.add(new byte[]{0, 1});
        for (int i = 0; i < badExample1.size(); i++) {
            System.out.println(badExample1.get(i));
        }
    }

    public static void initializeArrayListGoodExampleJava7Minus() {
        ArrayList<String> list = new ArrayList<String>();
    }

    public static void initializeArrayListGoodExampleJava8Plus() {
        ArrayList<Integer> list = new ArrayList<>();
    }

    public static void autoboxingAndUnboxing() {
        ArrayList<Integer> list = new ArrayList<>();
        int xUnboxed = 10;
        int y = 15;
        int z = 13;
        Integer xAutoBoxed = xUnboxed;
        Integer xExplicityBoxed = new Integer(xUnboxed);

        list.add(xUnboxed);
        list.add(y);
        list.add(z);

        Integer firstElementNonPrimitive = list.get(0); // autoboxed
        int firstElementPrimitive = list.get(0); // unboxed
    }

    public static void demonstrateWrapperStaticMethods() {
        Double negativeInfinity = Double.NEGATIVE_INFINITY;
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Double notANumber = Double.NaN;

        System.out.println(negativeInfinity);
        System.out.println(positiveInfinity);
        System.out.println(notANumber);
        System.out.println(positiveInfinity / 0);
    }

    public static void populateArrayListWithArrayElements() {
        int[] someArray = {1, 7, 9, 10};
        ArrayList<Integer> list = new ArrayList<>();

        for (int element : someArray) {
            list.add(element);
        }
        System.out.println(list);
    }

    public static void copyArrayList() {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(7);
        originalList.add(9);
        originalList.add(10);

        ArrayList<Integer> listClone = new ArrayList<>(originalList);
        listClone.add(15);

        System.out.println(originalList);
        System.out.println(listClone);
    }

    public static void arrayListToArray() {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(7);
        originalList.add(9);
        originalList.add(10);

        Integer[] array = originalList.toArray(new Integer[99999999]);

    }

    public static void demonstrateVarArgs(String... aBunchOfDifferentStrings) {
        for(String element : aBunchOfDifferentStrings) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        System.out.println("First Example");
        String[] preExistingArray = new String[]{"The","Quick","Brown","Fox","Jumps","Over","The","Lazy","Dog"};
        demonstrateVarArgs(preExistingArray);

        System.out.println("Second Example");
        demonstrateVarArgs("The", "Quick", "Brown", "Fox");
    }
}
