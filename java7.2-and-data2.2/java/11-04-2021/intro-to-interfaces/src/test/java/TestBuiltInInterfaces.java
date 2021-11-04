import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/4/21 2:44 PM
 */
public class TestBuiltInInterfaces {
    @Test
    public void testNumberInterface() {
        // given
        Number shortNum = 0;
        Number longNum = Long.MAX_VALUE;
        Number doubleNum = Double.MIN_VALUE;
        Number[] allNums = {shortNum, longNum, doubleNum};

        // when
        for(Number number : allNums) {
            // then
            System.out.println(number);
        }
    }
}
