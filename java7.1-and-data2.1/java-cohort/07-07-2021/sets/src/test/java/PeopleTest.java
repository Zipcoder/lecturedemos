import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/8/21 4:00 PM
 */
public class PeopleTest {
    @Test
    public void testAddPerson() {
        People people = new People();
        people.add(new Person());
        people.add(new Person());
        people.add(new Person());
        people.add(new Person());
        people.add(new Person());

        for(Person person : people) {
            System.out.println(person);
        }
    }
}
