import java.util.Stack;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/15/21 4:46 PM
 */
public class Deck {
    Stack<Card> cardStack = new Stack<>();

    public Deck() {
        for(Suit suit : Suit.values()) { // 4 suit
            for(Rank rank : Rank.values()) { // 13 rank
                cardStack.push(new Card(suit, rank));
            }
        }
    }
}
