import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/9/21 11:09 AM
 */
public class Person2 {
    private InstanceVariable id;
    private InstanceVariable familyMembers;

    public Person2(Long id, List<Person> familyMembers) {
        this.id = new InstanceVariable(id);
        this.familyMembers = new InstanceVariable(familyMembers);
    }
}
