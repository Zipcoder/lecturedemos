package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/17/21 7:04 PM
 */
@Repository
public interface PeopleRepository extends CrudRepository<People, Long> {
}
