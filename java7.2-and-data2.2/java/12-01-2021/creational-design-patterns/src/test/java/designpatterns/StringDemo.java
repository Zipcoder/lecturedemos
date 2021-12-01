package designpatterns;

import org.junit.Test;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/1/21 11:14 AM
 */
public class StringDemo {
    @Test
    public void demo() {
        String string = "Hello world";
        string = string.replaceAll("Hello", "");
        string = string.replaceAll("world", "");
        System.out.println(string);
    }
}
