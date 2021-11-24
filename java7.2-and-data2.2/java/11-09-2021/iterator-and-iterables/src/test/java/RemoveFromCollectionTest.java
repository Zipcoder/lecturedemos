import org.junit.Test;

import java.util.ArrayList;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/9/21 3:32 PM
 */
public class RemoveFromCollectionTest {
    @Test
    public void demo() {
        ArrayList<String> list = new ArrayList<>();
        String objectToAdd = "Hello";
//        list.add(objectToAdd);
        boolean outputOfRemoval = list.remove(objectToAdd);
        System.out.println(outputOfRemoval);
    }
}
