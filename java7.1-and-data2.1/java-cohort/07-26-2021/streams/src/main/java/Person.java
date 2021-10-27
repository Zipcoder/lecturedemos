/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 3:14 PM
 */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
