import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 9:58 AM
 */
public class LiskovSubstitutionExample {
    @Test
    public void test() {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList arrayList = new ArrayList<>(linkedList);
        printAllElements(arrayList);
        printAllElements(linkedList);

    }

    private void printAllElements(LinkedList<String> list) {
        for(String s : list) {
            System.out.println(s);
        }
    }

    private void printAllElements(ArrayList<String> list) {
        for(String s : list) {
            System.out.println(s);
        }
    }
}
