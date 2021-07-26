/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 11:03 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        Instructors instructors = new Instructors();
        instructors.add(new Person(0L, ""));
        instructors.getPersonList();
    }
}
