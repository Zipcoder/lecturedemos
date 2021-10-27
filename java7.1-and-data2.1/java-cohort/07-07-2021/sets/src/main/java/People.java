import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/8/21 3:53 PM
 */
public class People implements Comparable<People>, Iterable<Person> {
    private List<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public Person get(int index) {
        return personList.get(index);
    }

    public int getNumberOfPeople() {
        return personList.size();
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

    @Override
    public int compareTo(People o) {
        return 0;
    }
}
