package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/12/21 4:52 PM
 */
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private PersonalMetaData personalMetaData;

    @OneToOne
    private LicenseMetaData licenseMetaData;

    public Person() {
    }

    public Person(Long id, PersonalMetaData personalMetaData, LicenseMetaData licenseMetaData) {
        this.id = id;
        this.personalMetaData = personalMetaData;
        this.licenseMetaData = licenseMetaData;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalMetaData getPersonalMetaData() {
        return personalMetaData;
    }

    public void setPersonalMetaData(PersonalMetaData personalMetaData) {
        this.personalMetaData = personalMetaData;
    }

    public LicenseMetaData getLicenseMetaData() {
        return licenseMetaData;
    }

    public void setLicenseMetaData(LicenseMetaData licenseMetaData) {
        this.licenseMetaData = licenseMetaData;
    }
}
