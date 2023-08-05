<<<<<<< HEAD
package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @Column(name="_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long _id;
    private String firstName;
    private String lastName;
    private String email;

    public Client() { }

    public Client(String first, String last, String mail) {
        //this.Id=id;

        this.firstName = first;
        this.lastName = last;
        this.email = mail;
    }

    public Long getId() {
        return _id;
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

    public String toString() {
        return firstName + " " + lastName + " " + email;
    }



}
=======
package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @Column(name="_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long _id;
    private String firstName;
    private String lastName;
    private String email;

    public Client() { }

    public Client(String first, String last, String mail) {
        //this.Id=id;

        this.firstName = first;
        this.lastName = last;
        this.email = mail;
    }

    public Long getId() {
        return _id;
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

    public String toString() {
        return firstName + " " + lastName + " " + email;
    }



}
>>>>>>> 1d3548077929eb6e3396660c89db236faec4138e
