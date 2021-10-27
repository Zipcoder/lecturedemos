import java.util.Iterator;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/26/21 10:39 AM
 */
public class SomeIterator implements Iterator<String> {
    String[] arr = "The Quick Brown Fox".split(" ");
    int currentIndex = 0;

    @Override
    public boolean hasNext() {
        return currentIndex < arr.length;
    }

    @Override
    public String next() {
        String currentElement = arr[currentIndex];
        currentIndex++;
        return currentElement;
    }
}
