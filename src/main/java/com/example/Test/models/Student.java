package com.example.Test.models;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private LocalDate dob;

    public Student() {
    }

    public Student(String name, String surname, LocalDate dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                '}';
    }
}
