package com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.model;

import javax.persistence.*;

@Entity
@Table(name="employesss")
public class Employesss {
    @Id
    @GeneratedValue

    public Long id;
    @Column(name = "first_name")


    public String firstName;
    @Column(name = "last_name")


    public String lastName;
    @Column(name = "email")


    public  String email;

    public Employesss() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



