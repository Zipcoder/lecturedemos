package demoparent.functionalinterfaces;

import demoparent.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:22 AM
 */
public class BiFunctionTest {
    @Test
    public void testMethodReference1() {
        List<Person> personList = new ArrayList<>();
        BiFunction<Integer, Integer, List<Person>> biFunction = personList::subList;
    }
}
