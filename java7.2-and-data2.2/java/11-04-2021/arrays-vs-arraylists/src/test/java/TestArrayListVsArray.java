import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/4/21 3:13 PM
 */
public class TestArrayListVsArray {
    @Test
    public void testArrayListSize() {
        ArrayList<Integer> list = new ArrayList<>();
        int sizeOfListBeforeAdding = list.size();
        list.add(50);

        int sizeOfListAfterAdding = list.size();
        System.out.println(sizeOfListBeforeAdding);
        System.out.println(sizeOfListAfterAdding);
    }

    @Test
    public void testArrayLength() {
        Integer[] array = new Integer[1];
        int lengthOfArrayBeforeAdding = array.length;
        array[0] = Integer.MAX_VALUE;

        int lengthOfArrayAfterAdding = array.length;
        System.out.println(lengthOfArrayBeforeAdding);
        System.out.println(lengthOfArrayAfterAdding);
    }


    @Test
    public void testArrayInternals() {
        Integer[] array = new Integer[10]; // length of 10
        String arrayAsString = Arrays.toString(array);
        System.out.println(arrayAsString);
    }

    @Test
    public void testArrayListInternals() {
        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
        list.set(2, null);
        list.remove(2);
        list.clear();
        Integer x = list.get(0);
        System.out.println(list);
    }

    @Test
    public void testMultidimensionalArrayList() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int row = 10;
        int column = 2;
        Integer nestedInteger = list.get(row).get(column);

    }

    @Test
    public void testArrayRemoval() {

    }
}
