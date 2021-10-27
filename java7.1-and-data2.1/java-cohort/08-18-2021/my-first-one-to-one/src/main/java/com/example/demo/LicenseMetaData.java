package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/18/21 2:53 PM
 */
@Entity
public class LicenseMetaData {
    @JsonIgnore
    @OneToOne
    private Person parent;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Character clazz;
    private String issueDate;
    private String expirationDate;

    public LicenseMetaData() {
    }

    public LicenseMetaData(Long id, Character clazz, String issueDate, String expirationDate) {
        this.id = id;
        this.clazz = clazz;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getClazz() {
        return clazz;
    }

    public void setClazz(Character clazz) {
        this.clazz = clazz;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
