import java.util.ArrayList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/5/21 4:09 PM
 */
public class ListHandler {
    public static List<String> handle(List<String> list) {
        list.add("Hello");
        list.add("Yup");
        list.add("Brown fox");
        list.add(1, "Quick");
        String[] array = "The quick brown fox jumps over the lazy dog".split(" ");
        return list;
    }
}
