package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/11/21 9:30 AM
 */
@Configuration
public class PersonConfiguration {
    @Autowired
    private PersonService service;

    @PostConstruct
    public void setup() {
        service.create(new Person());
        service.create(new Person());
        service.create(new Person());
    }
}
