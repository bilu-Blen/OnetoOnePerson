package com.example.demo;

import javax.persistence.*;

@Entity
public class NationalId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nationalIdNum;
    private long dateIssued;

    @OneToOne(mappedBy = "nationalId")
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalIdNum() {
        return nationalIdNum;
    }

    public void setNationalIdNum(String nationalIdNum) {
        this.nationalIdNum = nationalIdNum;
    }

    public long getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(long dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
