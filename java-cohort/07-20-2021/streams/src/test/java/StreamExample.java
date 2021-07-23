import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/20/21 2:03 PM
 */
public class StreamExample {
    @Test
    public void test() {
        String[] seedData = "12 1234 0 The Quick Brown Fox Jumps Over The Lazy Dog".split(" ");
        List<Integer> list = Stream
                .of(seedData)
                .parallel()
                .map(str -> Integer.parseInt(str))
                .filter(num -> num < 10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
