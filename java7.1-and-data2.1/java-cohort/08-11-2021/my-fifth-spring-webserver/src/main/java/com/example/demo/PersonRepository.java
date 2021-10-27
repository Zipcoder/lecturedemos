package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/11/21 9:30 AM
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
