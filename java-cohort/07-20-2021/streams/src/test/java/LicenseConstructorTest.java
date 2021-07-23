import javafx.scene.paint.Color;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/20/21 1:40 PM
 */
public class LicenseConstructorTest {
    @Test
    public void test()  {
        License license = new LicenseBuilder()
                .setFirstName("Leon")
                .setLastName("Hunter")
                .setDateOfBirth(new Date())
                .setHeight(1)
                .build();
    }
    @Test
    public void testLicenseBuilderInstance() {
        LicenseBuilder licenseBuilder1 = new LicenseBuilder();
        LicenseBuilder licenseBuilder2 = licenseBuilder1.setFirstName("Leon");
        Assert.assertEquals(licenseBuilder1, licenseBuilder2);
    }
}
