import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 2:08 PM
 */
public class GameTest {
    @Test
    public void testGetWinner() {
        // given
        Game game = new Game();
        Player expectedWinner = new Player();
        game.add(expectedWinner);
        game.play();

        // when
        Player actualWinner = game.getWinner();

        // then
        Assert.assertEquals(expectedWinner, actualWinner);
    }
}
