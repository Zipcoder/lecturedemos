/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/28/21 12:01 PM
 */
public class RandomNumberGeneratorExample {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for (int i = 0; i < 100; i++) {
            System.out.println(randomNumberGenerator.getInteger(0, 100));
        }
    }
}
