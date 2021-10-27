package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/10/21 10:06 AM
 */
@Service // leverages repository to manipulate data
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public Person create(Person person) {
        return repository.save(person);
    }

    public List<Person> readAll() {
        Iterable<Person> personIterable = repository.findAll();
        List<Person> result = new ArrayList<>();
        personIterable.forEach(result::add);
        return result;
    }

    public Person read(Long id) {
        return repository.findById(id).get();
    }

    public Person update(Long id, Person newPersonData) {
        Person personInDb = read(id);
        newPersonData.setId(personInDb.getId());
        personInDb.setFirstName(newPersonData.getFirstName());
        personInDb.setLastName(newPersonData.getLastName());
        repository.save(personInDb);
        return personInDb;
    }

    public Person delete(Person person) {
        repository.delete(person);
        return person;
    }

    public Person delete(Long id) {
        return delete(read(id));
    }
}
