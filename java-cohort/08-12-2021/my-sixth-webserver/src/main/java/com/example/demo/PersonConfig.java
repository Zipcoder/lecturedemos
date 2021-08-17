package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/12/21 4:54 PM
 */
@Configuration
public class PersonConfig {
    @Autowired
    private PersonService service;

    @PostConstruct
    public void setup() {
        service.create(new Person());
        service.create(new Person());
        service.create(new Person());
        service.create(new Person());
    }
}
