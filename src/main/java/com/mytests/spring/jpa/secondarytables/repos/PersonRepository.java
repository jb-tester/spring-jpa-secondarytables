package com.mytests.spring.jpa.secondarytables.repos;

import com.mytests.spring.jpa.secondarytables.data.Person;
import com.mytests.spring.jpa.secondarytables.dto.PersonDTO;
import com.mytests.spring.jpa.secondarytables.dto.PersonProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 06.10.2021.</p>
 * <p>Project: spring-jpa-secondarytables</p>
 * *
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
    List<PersonProjection> findAllByCompany(String company);

    List<PersonDTO> findAllByTitle(String title);
}
