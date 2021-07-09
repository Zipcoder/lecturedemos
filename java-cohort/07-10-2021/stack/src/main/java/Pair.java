/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/9/21 1:41 PM
 */
public class Pair<Key extends Object, Value extends Object> {
    private Key key;
    private Value value;

    public Pair() {
    }

    public Pair(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
