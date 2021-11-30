package demoparent.functionalinterfaces;

import demoparent.Person;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:19 AM
 */
public class FunctionTest {
    @Test
    public void testMethodReference1() {
        List<Person> personList = new LinkedList<>();
        Function<Integer, Person> function = personList::get;
    }

    @Test
    public void testMethodReference2() {
        Function<Integer, Random> function = Random::new;
    }
}
