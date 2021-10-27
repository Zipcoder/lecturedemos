import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 11:04 AM
 */
public interface PeopleInterface {
    List<Person> getPersonList();

    default Integer count() {
        return getPersonList().size();
    }

    default void add(Person person) {
        getPersonList().add(person);
    }

    default void remove(Person person) {
        getPersonList().remove(person);
    }

    default Person findById(Long id) {
        for (Person person : getPersonList()) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    default Boolean contains(Person person) {
        return getPersonList().contains(person);
    }
}
