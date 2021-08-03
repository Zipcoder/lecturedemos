package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
// create - POST
// read - GET
// update - PUT
// delete - DELETE
/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/3/21 4:48 PM
 */ // used to expose java-application operations (service layer, or business logic) to a front end 'client'
@Controller
@RequestMapping(value = "/person-controller") // localhost:8081/person-controller
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(method = RequestMethod.POST, value = "/create")// localhost:8081/person-controller/create
    public ResponseEntity<Person> create(@RequestBody Person personToCreate) {
        Person newlyCreatedPerson = service.create(personToCreate);
        return new ResponseEntity<>( newlyCreatedPerson, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/show-all")// localhost:8081/person-controller/show-all
    public ResponseEntity<List<Person>> readAll()  {
        List<Person> allPersons = service.readAll();
        return new ResponseEntity<>(allPersons, HttpStatus.OK);
    }

}
