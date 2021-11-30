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
public class License {
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

    public License() {
    }

    public License(String firstName, String lastName, Date birthDate, Address address, String height, String weight, Character gender, Integer licenseNumber, Color eyeColor, Color hairColor, BufferedImage image, Boolean isOrganDonor, Character classType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.licenseNumber = licenseNumber;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.image = image;
        this.isOrganDonor = isOrganDonor;
        this.classType = classType;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public Boolean getOrganDonor() {
        return isOrganDonor;
    }

    public void setOrganDonor(Boolean organDonor) {
        isOrganDonor = organDonor;
    }

    public Character getClassType() {
        return classType;
    }

    public void setClassType(Character classType) {
        this.classType = classType;
    }
}
