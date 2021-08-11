package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/10/21 10:12 AM
 */
@RestController // expose service operations to other _clients_
@RequestMapping(value = "/person-controller") // exposes endpoints on localhost:8080/person-controller
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(service.create(person), HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public ResponseEntity<List<Person>> readAll() {
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/webpage")
    public String page() {
        return new StringBuilder()
                .append("<h1>Hello world</h1>")
                .append("<br><br>")
                .append("<p>The quick brown fox</p>")
                .toString();
    }
}
