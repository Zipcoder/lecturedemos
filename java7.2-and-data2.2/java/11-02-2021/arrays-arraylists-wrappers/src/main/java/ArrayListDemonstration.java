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


    public static void main(String[] args) {

    }
}
