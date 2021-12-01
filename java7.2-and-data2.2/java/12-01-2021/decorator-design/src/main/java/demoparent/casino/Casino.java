package demoparent.casino;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:50 AM
 */
public class Casino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, welcome to my demoparent.casino, from here you can enter any of the following");
        System.out.println("Blackjack, GoFish, Slots, Roulette");
        String userInput = scanner.nextLine();
        GameInterface game = null;

        switch (userInput.toLowerCase(Locale.ROOT)) {
            case "blackjack":
                GameInterface bjg = new BlackJackGame();
                break;
            case "gofish":
                GameInterface gfg = new GoFishGame();
                break;

            case "slots":
                GameInterface slots = new SlotsGame();
                break;
            case "Roulette":
                GameInterface roulette = new RouletteGame();
                break;
        }
        game.run();
    }
}
