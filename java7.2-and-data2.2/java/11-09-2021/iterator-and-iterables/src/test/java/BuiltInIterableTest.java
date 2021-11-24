import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/9/21 3:03 PM
 */
public class BuiltInIterableTest {
    @Test
    public void testList() {
        List<String> list = new ArrayList<>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        list.add("jumps");
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            System.out.println(word);
        }

        for (String word : list) {
            System.out.println(word);
        }
    }

    @Test
    public void testIterable() {
        // given
        List<String> list = new ArrayList<>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        list.add("jumps");

        // when
        Iterator<String> iteratorObject = list.iterator();

        // then
        while (iteratorObject.hasNext()) {
            String currentObject = iteratorObject.next();
            System.out.println(currentObject);
        }
    }
}
