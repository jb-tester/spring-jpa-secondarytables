package com.mytests.spring.jpa.secondarytables;

import com.mytests.spring.jpa.secondarytables.data.Person;
import com.mytests.spring.jpa.secondarytables.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaSecondarytablesApplication implements CommandLineRunner {
    @Autowired
    PersonRepository repo;
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaSecondarytablesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (Person person : repo.findAll()) {
            System.out.println(person);
        }
    }
}
