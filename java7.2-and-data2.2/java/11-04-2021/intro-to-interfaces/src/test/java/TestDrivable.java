import org.junit.Test;
import shape.Rectangle3by5;
import shape.Shape;
import vehicle.Car;
import vehicle.Drivable;
import vehicle.Plane;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/4/21 2:34 PM
 */
public class TestDrivable {
    @Test
    public void testCar() {
        // given
        Car car = new Car();

        // when
        car.drive();

        // then: output is spit to display // TODO - create better testing structure
    }

    @Test
    public void testPlane() {
        // given
        Plane plane = new Plane();

        // when
        plane.drive();

        // then: output is spit to display // TODO - create better testing structure
    }

    @Test
    public void testDrivableArray() {
        // given
        Drivable car = new Car();
        Drivable plane = new Plane();
        Drivable[] drivables = new Drivable[]{car, plane};

        // when
        for(Drivable drivable : drivables) {
            drivable.drive(); // agnostic towards the type of drivable
        }

        // then: output is spit to display // TODO - create better testing structure
    }
}
