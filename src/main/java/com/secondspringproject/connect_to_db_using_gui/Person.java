package com.secondspringproject.connect_to_db_using_gui;


import jakarta.persistence.*;

@Entity
@Table(name ="person")
public class Person {

    @Id
    @Column(name="person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "person_email")
    private String personEmail;

    public Person() {
    }

    public Person(int id, String personName, String personEmail) {
        this.id = id;
        this.personName = personName;
        this.personEmail = personEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }
}
