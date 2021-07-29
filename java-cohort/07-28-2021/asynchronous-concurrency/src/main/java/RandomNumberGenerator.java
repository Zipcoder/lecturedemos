import java.util.concurrent.ThreadLocalRandom;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/28/21 12:00 PM
 */
public class RandomNumberGenerator {
    public double getInteger(int min, int max) {
        return getDouble(min, max).intValue();
    }

    public Double getDouble(double min, double max) {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
}
