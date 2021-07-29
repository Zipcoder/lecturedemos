import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/29/21 4:36 PM
 */
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Enter the game you would like to play");
        String userInput = new Scanner(System.in).nextLine();
        GameFactory gameFactory = GameFactory.valueOf(userInput);
        GameInterface game = gameFactory.createGame();
        game.play(null);
    }
}
