/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 10:22 AM
 */
public class DataDiscriminatorPerson extends DataValidatorPerson {
    public DataDiscriminatorPerson(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
        if (!name.equals("Leon")) {
            throw new RuntimeException("Nope, not me!");
        }
        super.setName(name);
    }
}
