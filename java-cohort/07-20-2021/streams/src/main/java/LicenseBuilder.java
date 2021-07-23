import javafx.scene.paint.Color;

import java.util.Date;

public class LicenseBuilder {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int height;
    private Color hairColor;
    private Long licenseId;
    private Character classification;

    public LicenseBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LicenseBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LicenseBuilder setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public LicenseBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public LicenseBuilder setHairColor(Color hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public LicenseBuilder setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    public LicenseBuilder setClassification(Character classification) {
        this.classification = classification;
        return this;
    }

    public License build() {
        return new License(firstName, lastName, dateOfBirth, height, hairColor, licenseId, classification);
    }
}