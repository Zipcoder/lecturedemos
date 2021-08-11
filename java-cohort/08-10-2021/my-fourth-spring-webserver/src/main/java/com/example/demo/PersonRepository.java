package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/10/21 10:01 AM
 */ // an implementation of the Data Access Object design pattern
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
