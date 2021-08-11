package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/10/21 10:30 AM
 */
@Entity
public class People {
    @OneToMany
    private List<Person> personList;
}