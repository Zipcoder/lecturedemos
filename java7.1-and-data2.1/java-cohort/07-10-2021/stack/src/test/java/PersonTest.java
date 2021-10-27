import org.junit.Test;

import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/9/21 11:07 AM
 */
public class PersonTest {
    @Test
    public void test() {
        Person person = new Person(0L, "Leon", "Hunter", new Date());
        Date leonBirthDate = person.birthDate.getValue();

        Person[] personArray = new Person[]{new Person(), person};
        System.out.println(personArray);
    }
}
