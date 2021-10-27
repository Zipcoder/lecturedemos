import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/27/21 1:49 PM
 */
public class StreamExampleTest {
    @Test
    public void test2() {
        // given
        StreamExample streamExample = new StreamExample();
        Supplier<Integer> someMethod = () -> streamExample.mySupplierMethod();
        System.out.println("I have reference to some method!");
        System.out.println("I am about to invoke the method");

        //when
        int valueFromMethod = someMethod.get();

        // then
        System.out.println("I just invoked the method");
        System.out.println("The result from the method was");
        System.out.println(valueFromMethod);
    }

    @Test
    public void test3() {
        // given
        StreamExample streamExample = new StreamExample();
        Supplier<Integer> someMethod = () -> streamExample.mySupplierMethod();
        Stream<Integer> integerStream = Stream.generate(someMethod);

        //when
        Stream<Integer> resultingStream = integerStream.limit(10);
        List<Integer> resultingList = resultingStream.collect(Collectors.toList());

        // then
        System.out.println(resultingList);
    }

    @Test
    public void test1() {
        // given
        StreamExample streamExample = new StreamExample();
        Supplier<Integer> someMethod = streamExample::mySupplierMethod;
        System.out.println("I have reference to some method!");
        System.out.println("I am about to invoke the method");

        //when
        int valueFromMethod = someMethod.get();

        // then
        System.out.println("I just invoked the method");
        System.out.println("The result from the method was");
        System.out.println(valueFromMethod);
    }

    @Test
    public void test4() {
        StreamExample streamExample = new StreamExample();
        int lengthOfListOfRandoms = 15;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;

        //when
        List<Integer> listOfRandoms = someMethod.apply(lengthOfListOfRandoms);

        // then
        System.out.println(listOfRandoms);
    }

    @Test
    public void biFunctionExample() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        String secondArgument = "hello world";
        BiFunction<Integer, String, List<String>> someMethod = streamExample::biFunctionExampleMethod;

        //when
        List<String> listOfStrings = someMethod.apply(firstArgument, secondArgument);

        // then
        System.out.println(listOfStrings);
    }

    @Test
    public void filterExample1() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        listOfRandomIntegers = listOfRandomIntegers
                .stream()
                .filter(val -> val < 100)
                .collect(Collectors.toList());

        // then
        System.out.println(listOfRandomIntegers);
    }

    @Test
    public void filterExample2() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = (val) -> Arrays.asList(999);

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        listOfRandomIntegers = listOfRandomIntegers
                .stream()
                .filter(val -> val < 100)
                .collect(Collectors.toList());

        // then
        System.out.println(listOfRandomIntegers);
    }


    @Test
    public void filterExample3() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;
        Predicate<Integer> isValueLessThan100 = (val) -> val < 10;

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        listOfRandomIntegers = listOfRandomIntegers
                .stream()
                .filter(isValueLessThan100)
                .collect(Collectors.toList());

        // then
        System.out.println(listOfRandomIntegers);
    }


    @Test
    public void filterExample4() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;
        Function<Integer, Boolean> isValueLessThan100 = (val) -> val < 10;

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        listOfRandomIntegers = listOfRandomIntegers
                .stream()
                .filter((val) -> isValueLessThan100.apply(val))
                .collect(Collectors.toList());

        // then
        System.out.println(listOfRandomIntegers);
    }

    @Test
    public void mapExample() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        List<Person> listOfRandomPersons = listOfRandomIntegers
                .stream()
                .map(val -> new Person(val.toString()))
                .collect(Collectors.toList());


        // then
        System.out.println(listOfRandomPersons);
    }


    @Test(expected = IllegalStateException.class)
    public void terminalOperationExample1() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        Stream<Person> streamOfPerson = listOfRandomIntegers
                .stream()
                .map(val -> new Person(val.toString()));
        List<Person> listOfRandomPersons = streamOfPerson.collect(Collectors.toList());

        // throws IllegalStateException, or something like that
        List<Person> listOfAnotherRandomPersons = streamOfPerson.collect(Collectors.toList());
    }


    @Test(expected = IllegalStateException.class)
    public void terminalOperationExample2() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        Stream<Person> streamOfPerson = listOfRandomIntegers
                .stream()
                .map(val -> new Person(val.toString()));
        long amount = streamOfPerson.count();

        // throws IllegalStateException, or something like that
        amount = streamOfPerson.count();
    }

    public void optionalExample() {
        // given
        StreamExample streamExample = new StreamExample();
        Integer firstArgument = 10;
        Function<Integer, List<Integer>> someMethod = streamExample::getRandomNumbers;

        //when
        List<Integer> listOfRandomIntegers = someMethod.apply(firstArgument);
        Person streamOfPerson = listOfRandomIntegers
                .stream()
                .filter(val -> val < 100)
                .map(val -> new Person(val.toString()))
                .findAny()
                .orElse(new Person("George"));

        // throws IllegalStateException, or something like that
        System.out.println(streamExample);
    }
}
