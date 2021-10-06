package com.mytests.spring.jpa.secondarytables.data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * *
 * <p>Created by irina on 06.10.2021.</p>
 * <p>Project: spring-jpa-secondarytables</p>
 * *
 */
@Embeddable
public class Address {
    @Column(name = "CITY", table = "ADDRESS")
    private String city;
    @Column(name = "STREET", table = "ADDRESS")
    private String street;
    @Column(name = "BUILDING", table = "ADDRESS")
    private int building;
    @Column(name = "FLAT", table = "ADDRESS")
    private int flat;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Address: " +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", flat=" + flat +
                ' ';
    }
}
