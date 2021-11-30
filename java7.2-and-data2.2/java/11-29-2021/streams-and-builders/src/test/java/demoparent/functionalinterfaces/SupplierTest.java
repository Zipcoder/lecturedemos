package demoparent.functionalinterfaces;

import demoparent.Person;
import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:07 AM
 */
public class SupplierTest {
    @Test
    public void testMethodReference1() {
        Person person = new Person();
        Supplier<String> supplier = person::toString;
        supplier.get();
    }

    @Test
    public void testMethodReference2() {
        Person person = new Person();
        Supplier<Integer> supplier = person::hashCode;
    }


    @Test
    public void testMethodReference3() {
        Random random = new Random();
        Supplier<Integer> supplier = random::nextInt;
    }




}
