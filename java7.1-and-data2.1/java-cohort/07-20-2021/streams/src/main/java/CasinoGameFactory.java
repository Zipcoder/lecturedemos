import java.util.function.Supplier;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/20/21 11:58 AM
 */
public enum CasinoGameFactory {
    BLACKJACK(BlackJackGame::new),
    NUMBER_GUESS_GAME(NumberGuessGame::new);

    private Supplier<GameInterface> gameInterfaceSupplier;

    CasinoGameFactory(Supplier<GameInterface> gameInterfaceSupplier) {
        this.gameInterfaceSupplier = gameInterfaceSupplier;
    }

    public GameInterface createNewGame() {
        return gameInterfaceSupplier.get();
    }


    public static GameInterface createNewGame(String userInput) {
        return CasinoGameFactory.valueOf(userInput).createNewGame();
    }
}
