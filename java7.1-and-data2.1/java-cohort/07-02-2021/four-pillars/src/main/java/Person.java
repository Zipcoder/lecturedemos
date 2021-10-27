/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 9:44 AM
 */
public class Person {
    protected String name; // protected gives sub class access
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
