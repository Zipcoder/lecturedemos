package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/11/21 9:37 AM
 */
@RestController
@RequestMapping(value = "/person-controller") // serves up on localhost:8080/person-controller
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    // exposed at localhost:8080/person-controller/create
    public ResponseEntity<Person> create(@RequestBody Person person) { // `@RequestBody` allows us to inject JSON objects (representative of POJO instances) into our Spring server from our front-end client (mocked by Postman)
        return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/read/{id}")
    public ResponseEntity<Person> read(@PathVariable Long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/read")
    public ResponseEntity<List<Person>> readAll() {
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newPersonData) {
        return new ResponseEntity<>(service.update(id, newPersonData), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public ResponseEntity<Person> delete(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
