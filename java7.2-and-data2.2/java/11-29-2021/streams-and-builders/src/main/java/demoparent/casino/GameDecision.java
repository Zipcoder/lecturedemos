package demoparent.casino;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 11:54 AM
 */
public enum GameDecision {
    BLACKJACK(()-> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the new BlackJack Game");
        System.out.println("Before the game starts, provide your player-profile id");
        String userInput = scanner.nextLine();
        BlackJackGame blackJackGame = new BlackJackGame();
        blackJackGame.setInput(userInput);
        blackJackGame.run();
        return blackJackGame;
    }),
    GOFISH(GoFishGame::new),
    ROULETTE(RouletteGame::new),
    SLOTS(SlotsGame::new);

    private final Supplier<GameInterface> gameGenerator;

    GameDecision(Supplier<GameInterface> gameGenerator) {
        this.gameGenerator = gameGenerator;
    }

    public GameInterface createGame() {
        return gameGenerator.get();
    }
}
