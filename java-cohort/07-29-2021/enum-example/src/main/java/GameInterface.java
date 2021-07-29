/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/29/21 5:03 PM
 */
public interface GameInterface {
    default void addPlayer(Person person) {

    }

    default <ReturnType, ArgumentType> ReturnType play(ArgumentType argument) {
        System.out.println("The name of this class is = " + getClass().getSimpleName());
        return null;
    }
}
