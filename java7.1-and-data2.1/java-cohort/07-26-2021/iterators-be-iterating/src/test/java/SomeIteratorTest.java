import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 10:42 AM
 */
public class SomeIteratorTest {
    @Test
    public void test() {
        SomeIterator someIterator = new SomeIterator();
        while(someIterator.hasNext()) {
            System.out.println(someIterator.next());
        }
    }
}
