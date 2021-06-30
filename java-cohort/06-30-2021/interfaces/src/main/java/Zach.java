/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/30/21 1:54 PM
 */
public class Zach implements NoteTaker {
    @Override
    public String takeNotes(String content) {
        return new StringBuilder()
                .append("Hey I am writing this by hand!\n\t")
                .append(content)
                .toString();
    }
}
