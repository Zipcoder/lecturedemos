/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 10:55 AM
 */
public class Person { // class signature
    private String myName; // instance variable

    // no-arg (nullary) constructor
    public Person() { // constructor signature
        this.myName = "Leon"; // setting instance variable
    }

    public Person(String name) { // constructor signature
        this.myName = name; // setting instance variable
    }

    // DON'T DO IT!
    // violation of 'single responsibility principle'
    // https://en.wikipedia.org/wiki/Single-responsibility_principle
    public String setAndGetMyName(String myName) {
        this.setMyName(myName);
        return this.getMyName();
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }
}