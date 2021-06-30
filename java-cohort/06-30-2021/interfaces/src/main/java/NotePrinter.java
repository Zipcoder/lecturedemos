/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/30/21 2:00 PM
 */
public class NotePrinter {
    public void printNotes(String content, NoteTaker... noteTakers) {
        for(NoteTaker noteTaker : noteTakers) {
            String note = noteTaker.takeNotes(content);
            System.out.println(note);
        }
    }
}
