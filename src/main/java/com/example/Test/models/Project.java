package com.example.Test.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Project {
    @Id
    @SequenceGenerator(name = "project_sequence", sequenceName = "project_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_sequence")
    private Long id;
    private String name;
    private String phoneNumber;
    @Column(unique = true)
    private String email;
    private String description;
    private String budget;
    private Date deadline;

    public Project() {
    }

    public Project(String name, String phoneNumber, String email, String description, String budget, Date deadline) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
        this.budget = budget;
        this.deadline = deadline;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDescription() {
        return description;
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

    public String getBudget() {
        return budget;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", description=" + description +
                ", Budget=" + budget +
                ", deadline=" + deadline +
                '}';
    }
}
