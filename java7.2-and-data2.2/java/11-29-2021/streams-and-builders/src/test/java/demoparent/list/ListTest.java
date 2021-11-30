package demoparent.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/30/21 11:22 AM
 */
public class ListTest {
    @Test
    public void test() {
        String someString = "";
        char[] characters = someString.toCharArray();
        List<Character> myList = new ArrayList<>();
        for (char primitiveChar : characters) {
            myList.add(primitiveChar);
        }
        IntStream stream = IntStream.range(10, 50).parallel();
        Stream<Integer> anotherStream = IntStream.range(10, 50).boxed();

    }
}
