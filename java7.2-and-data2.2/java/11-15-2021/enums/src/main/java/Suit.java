/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 4:19 PM
 */
public enum Suit {
    HEARTS("♥"),
    DIAMONDS("◇"),
    CLUBS("♧"),
    SPADES("♠");

    private final String graphic;

    Suit(String graphic) {
        this.graphic = graphic;
    }

    public String getGraphic() {
        return graphic;
    }
}
