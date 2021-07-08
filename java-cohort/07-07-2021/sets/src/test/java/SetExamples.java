import org.junit.Test;

import javax.rmi.CORBA.Stub;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/8/21 3:27 PM
 */
public class SetExamples {

    @Test
    public void testTreeSet1() {
        String[] words = "the quick brown fox jumps over the lazy dog".split(" ");
        Set<String> set = new TreeSet<>(Arrays.asList(words));
        set.add("the");
        System.out.println(set);
    }

    @Test
    public void testTreeSet2() {
        String[] words = {"John", "Charles", "Cutler", "Tuskegee"};
        Set<String> set = new TreeSet<>(Arrays.asList(words));
        System.out.println(set);
    }

    @Test
    public void testHashSet() {
        String[] words = {"John", "Charles", "Cutler", "Tuskegee"};
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);
    }

    @Test
    public void testLinkedHashSet() {
        String[] words = {"John", "Charles", "Cutler", "Tuskegee"};
        Set<String> set = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(set);
    }
}
