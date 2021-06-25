import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/25/21 3:12 PM
 */
public class PersonTest {
    @Test
    public void testMyMethod() {
        // Given
        String name = "Leon";
        Integer age = 25;
        Person leon = new Person(name, age);

        // When
        String getNameResult = leon.getName();
        Integer getAgeResult = leon.getAge();

        // Then
        Assert.assertEquals(name, getNameResult);
        Assert.assertEquals(age, getAgeResult);
    }
}
