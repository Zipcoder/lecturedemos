import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/17/21 9:45 AM
 */
public class SampleTest {
    @Test
    public void generateRandomNumberInRange() {
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadLocalRandom.current().nextInt(0, 10));
        }
    }
    @Test
    public void printAFile() {
        String currentDirectory = System.getProperty("user.dir");
        String localFilePath = "/src/main/resources/sometext.txt";
        String absolutePath = currentDirectory + localFilePath;
        FilePrinter filePrinter = new FilePrinter(absolutePath);
        filePrinter.tryPrintFile();
    }
}
