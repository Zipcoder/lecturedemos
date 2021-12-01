package demoparent.functionalinterfaces;

import demoparent.Person;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 10:10 AM
 */
public class RunnableTest {
    @Test
    public void testLambdaExpression() {
        Runnable runnable = () -> System.out.println("Hello world");
        System.out.println("Hey there"); // this will print before "Hello world"
        runnable.run();
    }
    @Test
    public void testMethodReference() {
        Person person = new Person();
        Runnable runnable = person::checkOutMyMethod;
    }

}
