/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 2:55 PM
 */
public class Person { // this is called the signature of the class aka class-signature
    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() { // this is called the method-signature
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
