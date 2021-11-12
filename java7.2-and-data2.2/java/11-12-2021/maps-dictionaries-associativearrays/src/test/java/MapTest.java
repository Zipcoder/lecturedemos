import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/12/21 10:42 AM
 */
public class MapTest {
    @Test
    public void testList() {
        // given
        List<String> stringList = new ArrayList<>();
        stringList.add(0, "Hello");
        stringList.add(1, "World");

        // when
        String firstElement = stringList.get(0);
        String secondElement = stringList.get(1);

        // then
        System.out.println(firstElement);
        System.out.println(secondElement);
    }

    @Test
    public void testMappingOfIntegerToString() {
        // given
        Map<Integer, String> map = new TreeMap<>();
        map.put(1234, "World");
        map.put(10, "Hello");
        map.put(1, "Quick");

        // when
        String firstElement = map.get(1234);
        String secondElement = map.get(10);
        String thirdElement = map.get(1);
        String nonExistentElement = map.get(1328903129);

        // then
        System.out.println(firstElement);
        System.out.println(secondElement);
        System.out.println(thirdElement);
        System.out.println(nonExistentElement);
        System.out.println(map);
    }

    @Test
    public void testMappingOfStringToInteger() {
        // given
        Map<String, Integer> map = new TreeMap<>();
        map.put("Alan", 1111111);
        map.put("alice", 1234567);
        map.put("Alice", 12345678); // overwrites the previous entry whose key is "Alice"
        map.put("Bob", 8123456);

        // when
        Integer firstElement = map.get("Alice");
        Integer secondElement = map.get("Alan");
        Integer nonExistentElement = map.get("Bob");

        // then
        System.out.println(firstElement);
        System.out.println(secondElement);
        System.out.println(nonExistentElement);
        System.out.println(map);
    }

    @Test
    public void testMappingOfStringToString() {
        // given
        Map<String, String> map = new TreeMap<>();
        map.put("Alan", "555-111-1111");
        map.put("alice", "555-123-4567");
        map.put("Alice", "12345678"); // overwrites the previous entry whose key is "Alice"
        map.put("Bob", "8123456");

        // when
        String firstElement = map.get("Alice");
        String secondElement = map.get("Alan");
        String nonExistentElement = map.get("Bob");

        // then
        System.out.println(firstElement);
        System.out.println(secondElement);
        System.out.println(nonExistentElement);
        System.out.println(map);
    }

    @Test
    public void testMapKeySetStringToString() {
        // given
        Map<String, String> map = new TreeMap<>();
        map.put("Alan", "555-111-1111");
        map.put("alice", "555-123-4567");
        map.put("Alice", "12345678"); // overwrites the previous entry whose key is "Alice"
        map.put("Bob", "8123456");

        // when
        Set<Map.Entry<String, String>> allEntries = map.entrySet();

        // then
        for (Map.Entry<String, String> entry : allEntries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("The key is " + key);
            System.out.println("The value is " + value);
        }
    }

    @Test
    public void testMapKeySetIntegerToString() {
        // given
        Map<Integer, String> map = new TreeMap<>();
        map.put(1234, "World");
        map.put(10, "Hello");
        map.put(1, "Quick");

        // when
        Set<Map.Entry<Integer, String>> allEntries = map.entrySet();

        // then
        for (Map.Entry<Integer, String> entry : allEntries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("The key is " + key);
            System.out.println("The value is " + value);
        }
    }

    @Test
    public void lexigraphicalOrder() {
        System.out.println((int) 'A' + " - A");
        System.out.println((int) 'Z' + " - Z");
        System.out.println((int) 'a' + " - a");
        System.out.println((int) 'z' + " - z");
    }

}
