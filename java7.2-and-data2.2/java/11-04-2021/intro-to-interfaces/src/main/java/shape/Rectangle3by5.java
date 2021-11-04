package shape;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/4/21 2:12 PM
 */
public class Rectangle3by5 implements Rectangle {
    @Override
    public void display() {
        for (int i = 0; i < getLength(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public int getWidth() {
        return 5;
    }

    @Override
    public int getLength() {
        return 3;
    }
}
