/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 11:05 AM
 */
public class Person {
    private Long id;
    private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseStudyTime(double amountOfHours) {

    }
}
