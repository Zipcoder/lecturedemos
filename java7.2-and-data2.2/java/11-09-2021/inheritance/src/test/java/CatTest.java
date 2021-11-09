import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/9/21 11:18 AM
 */
public class CatTest {
    @Test
    public void breatheTest() {
        // given
        Animal someAnimal = new Dog();

        // when
        String output = someAnimal.breathe();
        System.out.println(output);

        // then
        Assert.assertEquals("huh", output);
    }
}
