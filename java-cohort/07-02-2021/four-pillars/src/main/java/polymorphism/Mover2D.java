package polymorphism;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 11:26 AM
 */
public interface Mover2D {
    public static final int questionToAnswerLater = 0;
    abstract public void setLocation(int x, int y);

    int getX();
    int getY();
}
