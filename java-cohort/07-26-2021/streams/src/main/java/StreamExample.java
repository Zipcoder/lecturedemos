import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 2:52 PM
 */
public class StreamExample {
    private String[] names = "The quick brown fox jumps".split(" ");
    public boolean hasNameGreaterThan(List<Person> personList, Integer lengthOfName) {
        return personList
                .stream()
                .anyMatch(person -> person.getName().length() > lengthOfName);
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
                .generate(() -> {
                    int randomValue = new Random().nextInt();
                    System.out.println(randomValue);
                    return randomValue;
                })
                .collect(Collectors.toList());
    }

    public static List<Integer> range(int start, int stop) {
        List<Integer> list =  Stream
                .iterate(start, n -> n + 1)
                .limit(stop)
                .collect(Collectors.toList());
        list.add(10);
        return list;
    }

    public static void main(String[] args) {
        for(int i : range(5, 10)) {
            System.out.println(i);
        }
    }
}
