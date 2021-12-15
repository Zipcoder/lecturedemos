package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/15/21 3:17 PM
 * responsible for
 * incoming requests
 * outgoing responses
 */
@Controller
@RequestMapping(value = "/person-controller")
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Person> create(@RequestBody Person personRequestedToPersist) {
        return service.create(personRequestedToPersist);
    }

    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> read(@PathVariable Long id) {
        return service.read(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person newData) {
        return service.update(id, newData);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Person> delete(@PathVariable Long id) {
        return service.delete(id);
    }

}
