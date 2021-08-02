package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 2:35 PM
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

    public Person update(Long idOfPersonToUpdate, Person newPersonData) {
        Person personInDatabase = read(idOfPersonToUpdate);
        personInDatabase.setFirstName(newPersonData.getFirstName());
        personInDatabase.setLastName(newPersonData.getLastName());
        repository.save(personInDatabase);
        return personInDatabase;
    }

    public Person delete(Person personToDelete) {
        repository.delete(personToDelete);
        return personToDelete;
    }

    public Person delete(Long idOfPersonToDelete) {
        return delete(read(idOfPersonToDelete));
    }
}
