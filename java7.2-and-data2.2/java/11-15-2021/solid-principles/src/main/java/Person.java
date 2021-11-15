/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 10:26 AM
 */
public final class Person implements Identifiable, Serializable {
    private final String serial;
    private final Long id;
    public Person(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Long identify() { return id; }
    public String serialize() { return serial; }
}
