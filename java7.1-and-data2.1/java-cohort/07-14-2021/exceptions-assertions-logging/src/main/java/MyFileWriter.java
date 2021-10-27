import java.io.FileWriter;
import java.io.IOException;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/14/21 10:21 AM
 */
public class MyFileWriter {
    public void write(String fileName, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
    }

    public void useWriteMethod() throws IOException {
        write("","");
    }

    public static void main(String[] args) {
        MyFileWriter myFileWriter = new MyFileWriter();
//        myFileWriter.useWriteMethod();
    }
}
