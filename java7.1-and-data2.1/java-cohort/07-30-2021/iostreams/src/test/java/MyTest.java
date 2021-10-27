import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/30/21 9:50 AM
 */
public class MyTest {

    @Test
    public void getBytes1() {
        System.out.println(Arrays.toString("1".getBytes()));
        String s = "There " + 2 + "two foxes in the pen";
        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println((byte) '1');
        System.out.println((byte) 1);
    }

    @Test
    public void getBytes() {
        System.out.println(Arrays.toString("The quick brown fox jumps over the lazy dog".getBytes()));
    }

    @Test
    public void createPath() {
        Path path1 = Paths.get("someplace/somepic.jpg");
        File file = path1.toFile();
    }

    @Test
    public void fileOperationOptions() {
        Path source = Paths.get("");
        Path target = Paths.get("");
        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
