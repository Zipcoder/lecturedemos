import java.util.function.BiConsumer;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/20/21 1:28 PM
 */
public class BiConsumerExample {
    private final String str;

    public BiConsumerExample(String str) {
        this.str = str;
    }

    public String reverseString() {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseString(String str) {
        return new BiConsumerExample(str).reverseString();
    }
}
