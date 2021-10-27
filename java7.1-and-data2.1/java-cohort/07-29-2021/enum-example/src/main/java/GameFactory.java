import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/29/21 5:01 PM
 */
public enum GameFactory {
    BLACKJACK(BlackJackGame::new),
    POKER(PokerGame::new),
    SLOTS(SlotsGame::new);


    private final Supplier<GameInterface> gameConstructor;

    GameFactory(Supplier<GameInterface> gameConstructor) {
        this.gameConstructor = gameConstructor;
    }

    public GameInterface createGame() {
        return gameConstructor.get();
    }

    public static GameFactory getValueOf(String input) {// string sanitization
        return valueOf(input.toUpperCase());
    }
}
