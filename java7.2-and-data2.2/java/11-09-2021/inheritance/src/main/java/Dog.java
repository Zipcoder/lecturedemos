/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/9/21 10:44 AM
 */
public class Dog extends Animal{
    @Override
    public String makeNoise() {
        return "bark!";
    }

    @Override
    public boolean isInExistence() {
        return true;
    }
}
