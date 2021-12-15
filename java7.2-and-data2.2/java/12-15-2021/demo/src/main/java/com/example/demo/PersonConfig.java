package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/15/21 3:13 PM
 */
@Configuration
public class PersonConfig {
    private PersonRepository repository;

    @Autowired
    public PersonConfig(PersonRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void setup() {
        repository.save(new Person());
    }
}
