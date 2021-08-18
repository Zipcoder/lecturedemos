package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 8/18/21 2:43 PM
 */
public interface PeopleRepository extends CrudRepository<People, Long> {
}
