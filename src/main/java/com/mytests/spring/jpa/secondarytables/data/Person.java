package com.mytests.spring.jpa.secondarytables.data;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 06.10.2021.</p>
 * <p>Project: spring-jpa-secondarytables</p>
 * *
 */
@Entity
@Table(name = "PERSON")
@SecondaryTable(name = "ADDRESS", pkJoinColumns = @PrimaryKeyJoinColumn(name = "ID") )
@SecondaryTable(name = "EMPLOYMENT",pkJoinColumns = @PrimaryKeyJoinColumn(name = "ID") )
@SecondaryTable(name = "CONTACT", pkJoinColumns = @PrimaryKeyJoinColumn(name = "ID"))
public class Person {
    // Address
    @Embedded
    Address address;
    
    // Employment
    @Column(name = "COMPANY", table = "EMPLOYMENT")
    private String company;
    @Column(name = "TITLE", table = "EMPLOYMENT")
    private String title;
    
    // Contact
    @Column(name = "PHONE", table = "CONTACT")
    private String phone;
    @Column(name = "EMAIL", table = "CONTACT")
    private String email;
    
    // Person
    @Id @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "AGE")
    private int age;
    @Column(name = "GENDER")
    private String gender;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

  

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address.toString() +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ' ';
    }
}
