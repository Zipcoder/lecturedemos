import org.junit.Assert;
import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/3/21 2:06 PM
 */
public class InventoryTest {
    @Test
    public void testGetItem() {
        // given
        Inventory inventory = new Inventory();
        String expectedItem = "Milk";
        inventory.add(expectedItem);

        // when
        String actualItem = inventory.get(0);

        // then
        Assert.assertEquals(expectedItem, actualItem);
    }
}
