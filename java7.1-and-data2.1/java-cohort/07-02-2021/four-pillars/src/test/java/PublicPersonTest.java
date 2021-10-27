import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 10:11 AM
 */
public class PublicPersonTest {

    @Test
    public void test() {
        // given
        PublicPerson publicPerson = new PublicPerson();
        String expectedName = "Whatever I want it to be";

        // when
        publicPerson.name = expectedName;

        // then
        String actualName = publicPerson.name;
        Assert.assertEquals(expectedName,actualName);
    }
}
