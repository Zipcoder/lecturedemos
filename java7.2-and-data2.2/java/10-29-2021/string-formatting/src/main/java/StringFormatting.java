import java.text.NumberFormat;
import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 10/29/21 3:19 PM
 */
public class StringFormatting {
    public static void main(String[] args) {
        example3();
    }
    public static void example1() {
        double total = 10.00 - 9.33;

        String formattedTotal1 = String.format("Total is %15.3f", total);
        System.out.println(formattedTotal1); //Total is            0.67

    }
    public static void example2() {
        double total = 10.00 - 9.33;
        System.out.println(total); //0.6699999999999999
    }

    public static void example3() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Integer age = 28;
        Double averageAgeInClass = 23.81233;
        Date birthDate = new Date();
        String phrase = "My first name is %s. My last name is %s. My age is %s. My birthdate is %s";
        String output = String.format(phrase, firstName, lastName, age, birthDate);
        System.out.println(output);
    }
}
