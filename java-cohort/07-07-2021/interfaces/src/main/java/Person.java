/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/7/21 9:48 AM
 */
public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Current objective is to compare by name, then by age to ensure that tie-breakers are broke by age
     * @param somePerson the other object to compare against `this` object
     * @return positive value if `this` is successor, 0 if same ordinal, negative if `this` is not successor
     */
    @Override
    public int compareTo(Person somePerson) {
        Person me = this;
        String myName = me.getName();
        String otherPersonName = somePerson.getName();
        Integer stateOfDifference = myName.compareTo(otherPersonName);
        if(stateOfDifference == 0) { // same name
            Integer myAge = me.getAge();
            Integer otherPersonAge = somePerson.getAge();
            stateOfDifference = myAge - otherPersonAge;
        }
        return stateOfDifference;
    }
}
