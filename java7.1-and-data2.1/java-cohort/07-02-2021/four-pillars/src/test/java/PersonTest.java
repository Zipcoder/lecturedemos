import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 9:45 AM
 */
public class PersonTest {
    @Test
    public void testSetName() {
        // given
        String name = "Leon"; // name is "Leon"
        String newName = "Noel"; // newName will be "Noel"
        Person person = new Person(name, null); // person has `age` and `name`
        Assert.assertEquals(name, person.getName()); // ensure person has `name`

        // when
        person.setName(newName);

        // then
        Assert.assertEquals(newName, person.getName());
    }
}
