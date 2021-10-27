import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/9/21 11:02 AM
 */
public class Person {
    public InstanceVariable<Long> id;
    public InstanceVariable<String> firstName;
    public InstanceVariable<String> lastName;
    public InstanceVariable<Date> birthDate;

    public Person() {
    }

    public Person(Long id, String firstName, String lastName, Date birthDate) {
        this.id = new InstanceVariable<>(id);
        this.firstName = new InstanceVariable(firstName);
        this.lastName = new InstanceVariable(lastName);
        this.birthDate = new InstanceVariable(birthDate);
    }
}
