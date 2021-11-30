package demoparent.streams;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/29/21 1:39 PM
 */
public class StreamOfRandomsTest {
    @Test
    public void testLineByLine() {
        //Consumer<Double> methodReferenceConsumer = System.out::println;
        Consumer<Double> lambdaConsumer = x -> System.out.println(x);
        Stream<Double> stream = Stream.generate(Math::random);
        stream = stream.limit(4);
        stream.forEach(lambdaConsumer);
    }

    @Test
    public void testInLine() {
        Stream
                .generate(Math::random)
                .limit(4)
                .forEach(System.out::println);
    }

    @Test
    public void testFilter() {
        List<Double> list = Stream
                .generate(Math::random)
                .filter(val -> val < .5)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void testIterate() {
        Stream
                .iterate(5, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);
    }

    @Test
    public void demonstrateInterchangeability() {
        Function<Double, Boolean> f = val -> val < .5;
        Predicate<Double> p = val -> val < .5;
        Comparator<Integer> c = (val1, val2) -> val1.compareTo(val2);
    }

    @Test
    public void testTransformations() {
        Stream
                .generate(Math::random)
                .limit(5)
                .map(val -> new Wallet(val))
                .forEach(wallet -> wallet.increaseBalance(10));

    }

    @Test
    public void testTransformationsNested() {
        Stream<Wallet> walletStream = Stream
                .generate(Math::random)
                .limit(5)
                .map(val -> new Wallet(val));
        walletStream.forEach(System.out::println);
        walletStream.forEach(System.out::println);
    }

}