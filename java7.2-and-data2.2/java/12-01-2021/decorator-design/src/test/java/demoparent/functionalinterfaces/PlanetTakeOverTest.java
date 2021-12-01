package demoparent.functionalinterfaces;

import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 10:58 AM
 */
public class PlanetTakeOverTest {
    @Test
    public void testLambdaExpression() {
        PlanetTakeOver pto = (string, x) -> System.out.printf(string, x);
        pto.takeOverPlanet("Take over %s planets!", 5);
    }

    @Test
    public void testMethodReference() {
        PlanetTakeOver pto = System.out::printf;
        pto.takeOverPlanet("Take over %s planets!", 5);
    }
}
