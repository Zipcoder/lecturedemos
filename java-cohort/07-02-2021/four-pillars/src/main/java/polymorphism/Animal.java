package polymorphism;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 11:25 AM
 */
 abstract public class Animal implements Mover2D {
    abstract public String speak();

    @Override
    public void setLocation(int x, int y) {

    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }
}
