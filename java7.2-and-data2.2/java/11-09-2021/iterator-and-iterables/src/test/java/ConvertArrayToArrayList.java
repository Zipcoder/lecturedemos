import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/9/21 3:34 PM
 */
public class ConvertArrayToArrayList {
    @Test
    public void test() {
        String[] stringArray = "The quick brown fox jumps over the lazy dog".split(" ");
        List<String> unmodifiableList = Arrays.asList(stringArray);
        List<String> modifiableList = new ArrayList<>(unmodifiableList);

        modifiableList.remove("The");
        modifiableList.add("Onyx");
    }

    @Test
    public void retain() {
        String[] originalArray = {"The", "Quick", "Brown"};
        String[] elementsToBeRetained = {"The", "Quick"};
        List<String> originalList = new ArrayList<>(Arrays.asList(originalArray));
        List<String> retentionList = Arrays.asList(elementsToBeRetained);
        originalList.retainAll(retentionList);
        System.out.println(originalList);
    }

    @Test
    public void toArraySpecificType() {
        String[] originalArray = {"The", "Quick", "Brown"};
        String[] elementsToBeRetained = {"The", "Quick"};
        List<String> originalList = new ArrayList<>(Arrays.asList(originalArray));
        List<String> retentionList = Arrays.asList(elementsToBeRetained);
        originalList.retainAll(retentionList);
        String[] array = originalList.toArray(new String[123455678]);//  Liskov Substitution is achieved by programming against our higher-level interfaces and super-classes
        Object[] objArray = array;
        String s = array[0];
        System.out.println(s);
    }
}
