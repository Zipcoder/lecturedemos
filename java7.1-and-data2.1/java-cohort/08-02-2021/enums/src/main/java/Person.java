/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 3:20 PM
 */
public class Person {
    public static Person
            LEON = new Person(0L, "Leon", "Hunter"),
            RAY = new Person(1L, "Ray", "Fitz"),
            ZACH = new Person(2L, "Zach", "Singer");

    private Long id;
    private String firstName;
    private String lastName;

    private Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
