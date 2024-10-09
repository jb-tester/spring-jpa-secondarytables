package com.mytests.spring.jpa.secondarytables.dto;


public class PersonDTO {
    String surname;
    String name;
    String company;

    public PersonDTO(String surname, String name, String company) {
        this.surname = surname;
        this.name = name;
        this.company = company;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
               "surname='" + surname + '\'' +
               ", name='" + name + '\'' +
               ", company='" + company + '\'' +
               '}';
    }
}
