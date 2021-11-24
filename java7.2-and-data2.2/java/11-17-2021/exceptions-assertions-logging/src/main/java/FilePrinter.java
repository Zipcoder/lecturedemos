import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/17/21 10:01 AM
 */
class FilePrinter {
    private BufferedReader reader;

    public FilePrinter(String fileDirectory) {
        // What if the file does not exist?

        try {
            this.reader = new BufferedReader(new FileReader(fileDirectory));
        } catch (FileNotFoundException e) {
            File file = new File(fileDirectory);
            try {
                file.createNewFile();
                this.reader = new BufferedReader(new FileReader(file));
            } catch (IOException ioException) {
                throw new RuntimeException("Was unable to create the file");
            }
        }
    }

    public void printFile() throws IOException {
        String line = null;
        do {
            // What if the System fails to read in the next line?
            // (For example if the file was suddenly closed, modified, or deleted)
            line = reader.readLine();
            System.out.println(line);
        } while (line != null);
    }

    public void tryPrintFile() {
        try {
            printFile();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}