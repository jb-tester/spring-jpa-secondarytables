package com.mytests.spring.jpa.secondarytables.repos;

import com.mytests.spring.jpa.secondarytables.data.Person;
import com.mytests.spring.jpa.secondarytables.dto.PersonDTO;
import com.mytests.spring.jpa.secondarytables.dto.PersonProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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

    List<PersonDTO> searchDistinctByAgeGreaterThanEqual(int ageIsGreaterThan);

    List<Person> queryByName(String name);

    List<Person> readById(Integer id);

    List<Person> streamAllByName(String name);

    @Query("select p from Person p where p.name = ?1")
    List<Person> aCustomQuery(String name);
}
