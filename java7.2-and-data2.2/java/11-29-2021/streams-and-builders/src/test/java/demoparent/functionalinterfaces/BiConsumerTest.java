package demoparent.functionalinterfaces;

import demoparent.Person;
import org.junit.Test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:16 AM
 */
public class BiConsumerTest {
    @Test
    public void testMethodReference() {
        Map<Person, Long> map = new HashMap<>();
        BiConsumer<Person, Long> biConsumer = map::put;
    }

    @Test
    public void testMethodReference1() {
        PrintStream printStream = System.out;
        BiConsumer<String, Integer> biConsumer1 = printStream::printf;
        BiConsumer<String, Integer> biConsumer2 = System.out::printf;
    }

}
