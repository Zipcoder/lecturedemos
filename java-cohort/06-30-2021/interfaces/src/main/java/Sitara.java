/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/30/21 1:58 PM
 */
public class Sitara implements NoteTaker {
    @Override
    public String takeNotes(String content) {
        return new StringBuilder()
                .append("Hey I am writing this on my PC!\n\t")
                .append("<mark up language below>\n\t")
                .append("```.md\n\t\t")
                .append(content)
                .append("\n\t```")
                .toString();
    }

    public void pushNotes() {

    }
}
