/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 4:20 PM
 */
public class MainApplication {
    public static void main(String[] args) {
        Person[] persons = Person.values();
        for(Person person : persons) {
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
        }
    }
}
