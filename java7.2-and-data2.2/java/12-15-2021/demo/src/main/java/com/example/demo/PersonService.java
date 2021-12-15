package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/15/21 3:56 PM
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public ResponseEntity<Person> create(Person personRequestedToPersist) {
        Person personInDatabase = repository.save(personRequestedToPersist);
        ResponseEntity<Person> responseEntity = new ResponseEntity<>(personInDatabase, HttpStatus.CREATED);
        return responseEntity;
    }

    public ResponseEntity<Person> read(Long id) {
        Person personInDatabase = repository.findById(id).get();
        return new ResponseEntity<>(personInDatabase, HttpStatus.OK);
    }


    public ResponseEntity<Person> update(Long id, Person newData) {
        Person personInDatabase = repository.findById(id).get();
        String newFirstName = newData.getFirstName();
        String newLastName = newData.getLastName();
        personInDatabase.setFirstName(newFirstName);
        personInDatabase.setLastName(newLastName);
        personInDatabase = repository.save(personInDatabase);
        return new ResponseEntity<>(personInDatabase, HttpStatus.OK);
    }

    public ResponseEntity<Person> delete(Long id) {
        Person personToBeDeleted = repository.findById(id).get();
        repository.deleteById(id);
        return new ResponseEntity<>(personToBeDeleted, HttpStatus.OK);
    }
}
