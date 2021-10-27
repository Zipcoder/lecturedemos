import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 2:52 PM
 */
public class StreamExample {
    private String[] names = "The quick brown fox jumps".split(" ");

    // can be referenced as a Supplier<Integer>
    public int mySupplierMethod() {
        return (int)System.nanoTime();
    }

    public boolean hasNameGreaterThan(List<Person> personList, Integer lengthOfName) {
        return personList
                .stream()
                .anyMatch(person -> person.getName().length() > lengthOfName);
    }
    public Stream<String> letters(String someWord) {
        String[] characters = someWord.split("");
        return Stream.of(characters);
    }

    public Stream<Stream<String>> wordsMap(String[] someWords) {
        return Stream.of(someWords).map(w -> letters(w));
    }

    public Stream<String> wordsFlatMap(String[] someWords) {
        return Stream.of(someWords).sorted().flatMap(w -> letters(w));
    }

    public void printValuesForLoop() {
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }
    }

    public void printValuesStream() {
        Arrays.stream(names).forEach(string -> System.out.println(string));
    }

    public void printValuesListAndStream() {
        List<String> nameList = Arrays.asList(names);
        nameList.stream().forEach(System.out::println);
    }

    public void toStreamToList() {
        List<String> nameList = Arrays
                .stream(names)
                .collect(Collectors.toList());
    }

    public List<Integer> getRandomNumbers(int length) {
        return Stream
                .generate(() -> new Random().nextInt())
                .limit(length)
                .collect(Collectors.toList());
    }

    public static List<Integer> range(int start, int stop) {
        List<Integer> list = Stream
                .iterate(start, n -> n + 1)
                .limit(stop)
                .collect(Collectors.toList());
        list.add(10);
        return list;
    }

    public String[] mergeArrays(String[] array1, String[] array2) {
        return Stream
                .concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        for (int i : range(5, 10)) {
            System.out.println(i);
        }
    }

    public List<String> biFunctionExampleMethod(Integer integer, String s) {
        return Arrays.asList(integer + s);
    }
}
