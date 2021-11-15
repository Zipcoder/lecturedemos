/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 10:37 AM
 */
public class Animal implements Identifiable, Serializable{

    @Override
    public Long identify() {
        System.out.println("Hello");
        return null;
    }

    @Override
    public String serialize() {
        System.out.println("World");
        return null;
    }
}
