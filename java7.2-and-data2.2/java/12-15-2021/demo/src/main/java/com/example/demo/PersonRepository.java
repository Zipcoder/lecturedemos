package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 12/15/21 3:11 PM
 */
@Service
@Repository // optional
public interface PersonRepository extends CrudRepository<Person, Long> {
}
