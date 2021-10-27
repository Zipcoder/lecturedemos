import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/7/21 1:46 PM
 */
public class ListExamples {
    public void populateWithArray1() {
        String[] array = {"The", "Quick", "Brown", "Fox"};
        List<String> unmodifiableList = Arrays.asList(array);
        List<String> arrayList = new ArrayList<>(unmodifiableList);
        System.out.println(arrayList);
    }

    public void populateWithArray2() {
        String[] array = {"The", "Quick", "Brown", "Fox"};
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);
    }

    public void populateWithArray3() {
        List<String> arrayList = new ArrayList<>(Arrays.asList(new String[]{"The", "Quick", "Brown", "Fox"}));
        System.out.println(arrayList);
    }

    public void populateWithArray4() {
        System.out.println(new ArrayList<>(Arrays.asList(new String[]{"The", "Quick", "Brown", "Fox"})));
    }

    public void populateWithArray5() {
        System.out.println(Arrays.asList(new String[]{"The", "Quick", "Brown", "Fox"}));
    }

    public void populateWithArray(String[] array) {
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);
    }

    public void arrayListOfArrays1() {
        List<Integer[]> listOfIntArray = new ArrayList<>();
        listOfIntArray.add(new Integer[]{1, 2, 4, 6});
        listOfIntArray.add(new Integer[]{1, 2, 4, 6});
        listOfIntArray.add(new Integer[]{1, 2, 4, 6});
        listOfIntArray.add(new Integer[]{1, 2, 4, 6});
    }

    public void arrayListOfArrays2() {
        List<Integer[]> listOfIntArray = Arrays.asList(
                new Integer[]{1, 2, 4, 6}, // index of 0
                new Integer[]{1, 2, 4, 6}, // index of 1
                new Integer[]{1, 2, 4, 6}, // index of 2
                new Integer[]{1, 2, 4, 6}  // index of 3
        );
    }
}
