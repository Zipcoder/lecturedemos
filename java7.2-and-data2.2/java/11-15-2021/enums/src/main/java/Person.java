/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 4:26 PM
 */
public enum Person {
    LEON("Leon", "Hunter", 0L),
    KRIS("Kris", "Younger", 1L),
    DOLIO("Dolio", "Druante", 2L);

    private String firstName;
    private String lastName;
    private Long id;

    Person(String firstName, String lastName, Long id) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
