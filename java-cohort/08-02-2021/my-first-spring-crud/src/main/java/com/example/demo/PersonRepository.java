package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/2/21 2:21 PM
 * store and retrieve persons to and from the database (in this case, h2-database)
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
