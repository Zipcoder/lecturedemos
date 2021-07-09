import javafx.scene.paint.Color;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/9/21 1:44 PM
 */
public class PairTest {
    @Test
    public void testPennyPair() {
        // given
        String name = "Penny";
        Integer value = 1;

        // when
        Pair<String,Integer> coinValuePair = new Pair<>(name, value);

        // then
        String nameOfCoin = coinValuePair.getKey();
        Integer valueOfCoin = coinValuePair.getValue();
    }

    @Test
    public void testNickelPair() {
        // given
        String name = "Nickle";
        Integer value = 5;

        // when
        Pair<String,Integer> coinValuePair = new Pair<>(name, value);

        // then
        String nameOfCoin = coinValuePair.getKey();
        Integer valueOfCoin = coinValuePair.getValue();
    }

    @Test
    public void testCoinPairList() {
        List<Pair<String, Integer>> coinValuePairList = new ArrayList<>();
        Pair<String,Integer> pennyPair = new Pair<>("Penny", 1);
        Pair<String,Integer> nicklePair = new Pair<>("Nickle", 5);
        Pair<String,Integer> dimePair = new Pair<>("Dime", 10);
        Pair<String,Integer> quarterPair = new Pair<>("Quarter", 25);

        coinValuePairList.add(nicklePair);
        coinValuePairList.add(dimePair);
        coinValuePairList.add(pennyPair);
        coinValuePairList.add(quarterPair);

        Integer valueOfPenny = coinValuePairList.get(0).getValue();
    }


    @Test
    public void testCoinPairMap() {
        Map<String, Integer> coinValueMap = new ConcurrentHashMap<>();
        coinValueMap.put(null, Integer.MIN_VALUE);
        coinValueMap.put("The void and abyss", null);
        coinValueMap.put("Penny", 1);
        coinValueMap.put("Nickle", 5);
        coinValueMap.put("Dime", 10);
        coinValueMap.put("Quarter", 25);
        coinValueMap.replace("Penny", 10);

        Integer valueOfPenny = coinValueMap.get("Penny");
        Integer valueOfTheVoid = coinValueMap.get("The void and abyss");
        Integer valueOfTheMostNegativeThingEver = coinValueMap.get(null);

        System.out.println(coinValueMap);
    }
}
