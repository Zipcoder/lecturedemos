/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/9/21 10:43 AM
 */
abstract public class Animal implements NoiseMaker {
    public Animal() {
        String nameOfConcreteType = this.getClass().getName();
        System.out.println("Hey I am a " + nameOfConcreteType + " and it's nice to be in the world!!!");
    }

    public final String breathe() {
        return "Huhhhh!";
    }
}
