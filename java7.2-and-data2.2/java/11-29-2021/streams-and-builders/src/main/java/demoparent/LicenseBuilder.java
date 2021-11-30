package demoparent;

import javafx.scene.paint.Color;
import sun.jvm.hotspot.debugger.Address;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/30/21 11:47 AM
 */
public class LicenseBuilder {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Address address;
    private String height;
    private String weight;
    private Character gender;
    private Integer licenseNumber;
    private Color eyeColor;
    private Color hairColor;
    private BufferedImage image;
    private Boolean isOrganDonor;
    private Character classType;

    public LicenseBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LicenseBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LicenseBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public LicenseBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public LicenseBuilder setHeight(String height) {
        this.height = height;
        return this;
    }

    public LicenseBuilder setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public LicenseBuilder setGender(Character gender) {
        this.gender = gender;
        return this;
    }

    public LicenseBuilder setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    public LicenseBuilder setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public LicenseBuilder setHairColor(Color hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public LicenseBuilder setImage(BufferedImage image) {
        this.image = image;
        return this;
    }

    public LicenseBuilder setIsOrganDonor(Boolean isOrganDonor) {
        this.isOrganDonor = isOrganDonor;
        return this;
    }

    public LicenseBuilder setClassType(Character classType) {
        this.classType = classType;
        return this;
    }

    public License createLicense() {
        return new License(firstName, lastName, birthDate, address, height, weight, gender, licenseNumber, eyeColor, hairColor, image, isOrganDonor, classType);
    }
}