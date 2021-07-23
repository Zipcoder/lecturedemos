import org.junit.Test;

import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/23/21 3:08 PM
 */
public class MidPointArray {
    @Test
    public void testMidPointOfArray() {
        String[] names = new String[]{"The", "Quick", "Brown", "Fox"};
        int midPoint = names.length / 2;
        String midName = names[midPoint];
        System.out.println(midName);
    }
}
