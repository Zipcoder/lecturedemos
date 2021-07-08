/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/8/21 3:54 PM
 */
public class Person {
    private final long id;
    private String name;

    public Person() {
        this(null);
    }

    public Person(String name) {
        this.id = System.nanoTime();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}