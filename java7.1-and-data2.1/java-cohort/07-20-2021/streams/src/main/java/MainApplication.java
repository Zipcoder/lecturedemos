import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/20/21 11:41 AM
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the game that you would like to play");
        System.out.println("Here is a list of all games");
        System.out.println(Arrays.toString(CasinoGameFactory.values()));
        String userInput = scanner.nextLine();
        GameInterface gameInterface = CasinoGameFactory.createNewGame(userInput);
        System.out.println(gameInterface.getClass());
    }

    public static double consumerOfSupplierOfDouble(Supplier<Double> doubleSupplier) {
        // TODO - Some stuff to be done
        double value = doubleSupplier.get();
        // TODO - Some stuff to be done
        return value;
    }
}
