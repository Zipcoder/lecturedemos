import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 1:57 PM
 */
public class PersonTest {
    @Test
    public void testGetName() {
        // given
        Person person = new Person();
        String expectedName = "Leon";
        Assert.assertNotEquals(expectedName, person.getName());
        person.setName(expectedName);

        // when
        String actualName = person.getName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}
