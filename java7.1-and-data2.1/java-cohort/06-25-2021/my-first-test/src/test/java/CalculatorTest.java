import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/26/21 12:25 PM
 */
public class CalculatorTest {

    /**
     * The purpose of this method is to test the add method
     * This method includes a `@Test` annotation to auto-run junit test framework
     */
    @Test
    public void testAdd1() {
        // given
        Calculator calculator = new Calculator();
        int value1 = 5;
        int value2 = 10;
        int expected = 15;

        // when
        int actual = calculator.add(value1,value2);

        // then
        Assert.assertEquals(expected, actual);
    }


    /**
     * The purpose of this method is to test the add method
     * This method includes a `@Test` annotation to auto-run junit test framework
     */
    @Test
    public void testAdd2() {
        // given
        Calculator calculator = new Calculator();
        int value1 = 5;
        int value2 = 10;
        int expected = 15;

        // when
        int actual = calculator.add(value1,value2);

        // then
        Assert.assertEquals(expected, actual);
    }
}
