package vehicle;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/4/21 2:30 PM
 */
public class Car implements Drivable {
    @Override
    public void drive() {
        // if(!isElectric())
        System.out.println("Vroom!");
    }
}
