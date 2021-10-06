package com.mytests.spring.jpa.secondarytables.repos;

import com.mytests.spring.jpa.secondarytables.data.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * *
 * <p>Created by irina on 06.10.2021.</p>
 * <p>Project: spring-jpa-secondarytables</p>
 * *
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
    
}
