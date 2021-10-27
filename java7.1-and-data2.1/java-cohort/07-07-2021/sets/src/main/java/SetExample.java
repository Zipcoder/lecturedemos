import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/8/21 3:24 PM
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.addAll(Arrays.asList("The quick brown fox jumps over the lazy dog".split(" ")));
        System.out.println(set);
    }
}
