import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 10:42 AM
 */
public class DataValidatorPersonTest {
    @Test
    public void testNameAccess() {
        DataValidatorPerson person = new DataValidatorPerson("Leon", 28);
        String name = person.name;
    }
}
