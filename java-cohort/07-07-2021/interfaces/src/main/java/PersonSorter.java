import java.util.Arrays;
import java.util.Comparator;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/7/21 9:49 AM
 */
public class PersonSorter {
    public Person[] sort(Person[] personArray) {
        Arrays.sort(personArray);
        return personArray;
    }

    public Person[] sortByAge(Person[] personArray) {
        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getAge() - person2.getAge();
            }
        };
        Arrays.sort(personArray, ageComparator);
        return personArray;
    }

    public Person[] sortByName(Person[] personArray) {
        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        };
        Arrays.sort(personArray, nameComparator);
        return personArray;
    }
}
