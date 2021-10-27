import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/7/21 9:50 AM
 */
public class PersonSorterTest {
    @Test
    public void testSortByAge() {
        // given
        PersonSorter personSorter = new PersonSorter();
        Person dolio = new Person(30, "Dolio");
        Person leon = new Person(20, "Leon");
        Person kris = new Person(40, "Kris");
        Person dan = new Person(28, "Dan");
        Person[] people = {dolio, leon, kris, dan};
        Person[] expected = {leon, dan, dolio, kris};

        // when
        Person[] actual = personSorter.sortByAge(people);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortByName() {
        // given
        PersonSorter personSorter = new PersonSorter();
        Person dolio = new Person(30, "Dolio");
        Person leon = new Person(20, "Leon");
        Person kris = new Person(40, "Kris");
        Person dan = new Person(28, "Dan");
        Person[] people = {dolio, leon, kris, dan};
        Person[] expected = {dan, dolio, kris, leon};

        // when
        Person[] actual = personSorter.sortByName(people);

        // then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testSortByNameThenAge() {
        // given
        PersonSorter personSorter = new PersonSorter();
        Person dolio = new Person(30, "Dolio");
        Person leon1 = new Person(20, "Leon");
        Person leon2 = new Person(21, "Leon");
        Person kris = new Person(40, "Kris");
        Person dan = new Person(28, "Dan");
        Person[] people = {dolio, leon1, kris, dan, leon2};
        Person[] expected = {dan, dolio, kris, leon1, leon2};

        // when
        Person[] actual = personSorter.sort(people);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
