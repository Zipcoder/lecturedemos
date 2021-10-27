import javax.management.RuntimeErrorException;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 10:16 AM
 */
public class DataValidatorPerson extends Person {
    public DataValidatorPerson(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
        if(name.length() < 1) {
            throw new RuntimeException("No! You Fool! I Refute it!");
        }
        super.setName(name);
    }
}
