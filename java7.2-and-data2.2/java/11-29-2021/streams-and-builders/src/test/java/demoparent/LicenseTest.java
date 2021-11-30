package demoparent;

import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/30/21 11:49 AM
 */
public class LicenseTest {
    @Test
    public void test() {
        //License license = new License("Leon", "Hunter", new Date(), null, "6'0\"",)
        new String("Hello world")
                .substring(5, 10)
                .split("")
                .toString()
                .substring(3, 7);

        License license1 = new LicenseBuilder()
                .setBirthDate(new Date())
                .setFirstName("Leon")
                .setHairColor(Color.MEDIUMVIOLETRED)
                .setEyeColor(Color.ALICEBLUE)
                .setLastName("Hunter")
                .setLicenseNumber(10832)
                .createLicense();

        License license = new LicenseBuilder()
                .setFirstName("Leon")
                .setLastName("Hunter")
                .createLicense();
    }
}
