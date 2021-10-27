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
    private PersonService personService;

    @Autowired
    private PeopleRepository peopleRepository;

    @PostConstruct
    public void setup() {
        for (int i = 0; i < 4; i++) {
            personService.create(new Person());
        }
        People peopleToAddToDb = new People();
        peopleToAddToDb.setPersonList(personService.readAll());
        peopleRepository.save(peopleToAddToDb);
    }
}
