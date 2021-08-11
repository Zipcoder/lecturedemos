package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/11/21 9:32 AM
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
        Iterable<Person> personIterable = repository.findAll();
        List<Person> result = new ArrayList<>();
        personIterable.forEach(result::add);
        return result;
    }

    public Person update(Long id, Person newPersonData) {
        Person personInDatabase = read(id);
        newPersonData.setId(personInDatabase.getId());
        return repository.save(newPersonData);
    }

    public Person delete(Person person) {
        repository.delete(person);
        return person;
    }

    public Person delete(Long id) {
        return delete(read(id));
    }
}
