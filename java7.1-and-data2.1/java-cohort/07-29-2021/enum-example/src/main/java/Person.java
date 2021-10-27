/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/29/21 4:35 PM
 */
public enum Person {
    LEON(0L, "Leon", "Hunter"),
    HUNTER(1L, "Leon", "Hunter"),
    DOLIO(2L, "Dolio", "Durant"),
    DEE;

    private Long id;
    private String firstName;
    private String lastName;

    Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person() {
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
