package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 2:18 PM
 */
@Configuration
public class PersonConfiguration {
    @Autowired // spring will handle instantiation for us
    private PersonService personService;

    @PostConstruct
    public void setup() {
        personService.create(new Person());
        personService.create(new Person());
        personService.create(new Person());
    }
}
