package demoparent.functionalinterfaces;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:12 AM
 */
public class ConsumerTest {
    @Test
    public void testMethodReference1() {
        List<String> list = new ArrayList<>();
        Consumer<String> consumer = list::add;
    }

    @Test
    public void testMethodReference2() {
        List<String> list = new ArrayList<>();
        Consumer<String> consumer = list::remove;
    }

    @Test
    public void testMethodReference3() {
        Consumer<String> consumer = StringBuilder::new;
    }

    @Test
    public void testMethodReference4() {
        Consumer<String> consumer = System.out::print;
    }
}
