package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/12/21 4:58 PM
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public Person create(Person person) {
        return repository.save(person);
    }

    public Person read(Long id) {
        return repository.findById(id).get();
    }

    public List<Person> readAll() {
        Iterable<Person> iterable = repository.findAll();
        List<Person> result = new ArrayList<>();
        iterable.forEach(result::add);
        return result;
    }

    public Person update(Long id, Person newPersonData) {
        Person personInDb = read(id);
        personInDb.setFirstName(newPersonData.getFirstName());
        personInDb.setLastName(newPersonData.getLastName());
        personInDb = repository.save(personInDb);
        return personInDb;
    }

    public Person delete(Long id) {
        Person personToBeDeleted = read(id);
        repository.delete(personToBeDeleted);
        return personToBeDeleted;
    }

    public Person delete(Person person) {
        return delete(read(person.getId()));
    }
}
