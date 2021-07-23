import java.util.Objects;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/23/21 2:41 PM
 */
public class Person implements Comparable<Person>{
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person personToCompareAgainst) {
        return this.getName().compareTo(personToCompareAgainst.getName());
    }

    /**
     * Comparing object equivalence by instance variable values rather than memory location
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
