/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 11:33 AM
 */
public interface EducatorInterface {
    default void hostLecture(Person[] person, double numberOfHours) {
        for (int i = 0; i < person.length; i++) {
            Person person1 = person[i];
            lecture(person1, numberOfHours/ person.length);
        }
    }

    default void lecture(Person student, double amountOfHours) {
        student.increaseStudyTime(amountOfHours);
    }
}
