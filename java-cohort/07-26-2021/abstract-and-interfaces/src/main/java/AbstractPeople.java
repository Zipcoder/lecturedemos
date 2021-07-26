import java.util.ArrayList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 11:09 AM
 */
public abstract class AbstractPeople implements PeopleInterface {
    private final List<Person> personList;

    public AbstractPeople() {
        this(new ArrayList<>());
    }

    public AbstractPeople(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public List<Person> getPersonList() {
        return personList;
    }
}
