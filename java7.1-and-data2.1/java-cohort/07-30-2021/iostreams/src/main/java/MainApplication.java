import java.util.Arrays;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/30/21 9:50 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        Person person = new Person(10L, "Leon", "Hunter");
        System.out.println(person);
        System.out.println(Arrays.toString(person.toString().getBytes()));
        System.out.println((int)'2');
        System.out.println((char)80);
        System.out.println((int)'A');
    }
}
