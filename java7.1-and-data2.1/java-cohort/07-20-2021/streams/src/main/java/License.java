import javafx.scene.paint.Color;
import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 7/20/21 1:38 PM
 */
public class License {
    String firstName;
    String lastName;
    Date dateOfBirth;
    int height;
    Color hairColor;
    Long licenseId;
    Character classification;

    public License(String firstName, String lastName, Date dateOfBirth, int height, Color hairColor, Long licenseId, Character classification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.hairColor = hairColor;
        this.licenseId = licenseId;
        this.classification = classification;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public Long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
    }

    public Character getClassification() {
        return classification;
    }

    public void setClassification(Character classification) {
        this.classification = classification;
    }
}