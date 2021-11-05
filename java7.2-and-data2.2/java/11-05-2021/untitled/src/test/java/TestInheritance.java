import org.junit.Test;

import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/5/21 10:30 AM
 */
public class TestInheritance {
    @Test
    public void testInheritance() {
        Student student = new Student("Leon", new Date(), 'A');
        String nameOfStudent = student.getName();
    }
}
