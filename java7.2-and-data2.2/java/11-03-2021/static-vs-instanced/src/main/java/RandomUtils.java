import java.util.Random;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 3:10 PM
 */
public class RandomUtils {
    public static double getRandomDouble(int min, int max) {
        Random randomObject = new Random();
        System.out.println(randomObject.hashCode());
        double randomDoubleValue = randomObject.nextDouble();
        double randomDoubleValueInSpecifiedRange = randomDoubleValue * (max - min) + min;
        return randomDoubleValueInSpecifiedRange;
    }
}
