package polymorphism;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/2/21 11:25 AM
 */
public class Bird extends Animal implements Flyer {
    @Override
    public void fly(int distance) {
        this.setLocation(getX(), getY()+distance);
    }

    @Override
    public String speak() {
        return "chirp!";
    }
}
