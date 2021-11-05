import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/5/21 10:29 AM
 */
public class Student extends Person {
    private Character currentGrade;
    public Student(String name, Date birthDate, Character initialGrade) {
        super(name, birthDate);
        this.currentGrade = initialGrade;
    }

    public Character getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(Character currentGrade) {
        this.currentGrade = currentGrade;
    }
}
