/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 10:18 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        // VariableType variableName = new VariableType();
        Person leon = new Person();
        System.out.println(leon.getMyName());

        leon.setMyName("Hunter");
        System.out.println(leon.getMyName());

        Person anythingWeWant = new Person("whatever name we want");

        Phone android = new Phone("android", 7);
        Phone iPhone = new Phone("iPhone", 11);


    }
}
