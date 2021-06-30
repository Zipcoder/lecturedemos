import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/30/21 3:06 PM
 */
public class PersonTest {
    @Test
    public void nullaryConstructorTest() {
        // given
        String expectedName = null;

        // when
        Person person = new Person();
        String actualName = person.getFirstName();

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void parameterizedConstructorTest() {
        // given
        String expectedFirstName = "Leon";
        String expectedLastName = "Hunter";
        Integer expectedAge = 28;

        // when
        Person person = new Person(expectedFirstName, expectedLastName, expectedAge);
        String actualFirstName = person.getFirstName();
        String actualLastName = person.getLastName();
        Integer actualAge = person.getAge();

        // then
        System.out.println(person);
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedAge, actualAge);
    }


    @Test
    public void mutatePerson() {
        // given
        String expectedFirstName = "Leon";
        String expectedLastName = "Hunter";
        Integer expectedAge = 28;
        Person person = new Person(expectedFirstName, expectedLastName, expectedAge);
        System.out.println("State of person prior to mutation");
        System.out.println(person);

        // when
        person.setAge(29);

        // then
        System.out.println("State of person after mutation");
        System.out.println(person);
    }
}
