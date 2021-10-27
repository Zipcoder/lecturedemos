/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 3:21 PM
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.RAY;

        person.setFirstName("Something Else");
        System.out.println(person.getFirstName());
    }
}
