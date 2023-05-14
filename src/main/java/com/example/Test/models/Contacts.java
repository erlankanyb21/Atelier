package com.example.Test.models;

import javax.persistence.*;

@Entity
public class Contacts {
    @Id
    @SequenceGenerator(name = "contacts_sequence", sequenceName = "contacts_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contacts_sequence")
    private Long id;
    private String name;
    private String email;
    private String message;

    public Contacts() {
    }

    public Contacts(String name, String phoneNumber, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message=" + message +
                '}';
    }
}
