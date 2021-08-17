package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/17/21 7:04 PM
 */
@Configuration
public class PeopleConfig {
    @Autowired
    private PeopleRepository repository;

    @Autowired
    private PersonService personService;

    @PostConstruct
    public void setup() {
        repository.save(new People(0L, personService.readAll()));
    }
}
