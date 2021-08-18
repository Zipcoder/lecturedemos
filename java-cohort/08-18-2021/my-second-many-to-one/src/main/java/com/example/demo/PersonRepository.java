package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/12/21 4:53 PM
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
