package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 2:44 PM
 */ // expose ourselves to the internet; in a good way
@Controller
@RequestMapping("/person-controller")
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
    }

}
