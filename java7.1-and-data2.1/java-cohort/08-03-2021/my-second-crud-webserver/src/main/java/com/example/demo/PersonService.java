package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/3/21 4:40 PM
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

    public Person update(Long id, Person newPersonData) {
        Person personInDatabase = read(id);
        personInDatabase.setFirstName(newPersonData.getFirstName());
        personInDatabase.setLastName(newPersonData.getLastName());
        repository.save(personInDatabase);
        return personInDatabase;
    }

    public Person delete(Long id) {
        return delete(read(id));
    }

    public Person delete(Person person) {
        repository.delete(person);
        return person;
    }

    public List<Person> readAll() {
        Iterable<Person> personIterable = repository.findAll();
        List<Person> personList = new ArrayList<>();
        personIterable.forEach(personList::add);
        return personList;
    }
}
