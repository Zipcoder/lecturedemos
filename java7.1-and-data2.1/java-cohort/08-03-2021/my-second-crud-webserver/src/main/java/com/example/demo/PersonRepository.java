package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/3/21 4:27 PM
 */// Give us the ability to have CRUD operations; Create, Read, Update, Delete
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
