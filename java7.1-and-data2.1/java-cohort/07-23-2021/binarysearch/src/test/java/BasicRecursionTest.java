import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/23/21 3:19 PM
 */
public class BasicRecursionTest {
    @Test
    public void getPersonByNameBinSearchPositiveTest() {
        // given
        BasicRecursion basicRecursion = new BasicRecursion();
        String[] names = "Apple Dog John Sleuth George Todd Ashley Bob Ciara Sue".split(" ");
        String expectedName = "George";
        Person expected = new Person(expectedName);
        Person[] personArray = new Person[names.length];
        for (int i = 0; i < personArray.length; i++) {
            personArray[i] = new Person(names[i]);
        }

        // when
        Person actual = basicRecursion.getPersonByNameBinSearch(personArray, expectedName);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = AssertionError.class)
    public void getPersonByNameBinSearchNegativeTest() {
        // given
        BasicRecursion basicRecursion = new BasicRecursion();
        String[] names = "John George Todd Ashley Bob Ciara Sue".split(" ");
        String expectedName = "Georgee";
        Person expected = new Person(expectedName);
        Person[] personArray = new Person[names.length];
        for (int i = 0; i < personArray.length; i++) {
            personArray[i] = new Person(names[i]);
        }

        // when
        Person actual = basicRecursion.getPersonByNameBinSearch(personArray, expectedName);

        // then
        Assert.assertEquals(expected, actual);
    }
}
