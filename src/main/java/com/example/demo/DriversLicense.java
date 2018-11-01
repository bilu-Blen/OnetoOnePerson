package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class DriversLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String numberDriversLicense;
    private long year;
    private String location;

    @OneToOne(mappedBy = "driversLicense")
    @JsonIgnore
    private Person person;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberDriversLicense() {
        return numberDriversLicense;
    }

    public void setNumberDriversLicense(String numberDriversLicense) {
        this.numberDriversLicense = numberDriversLicense;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
