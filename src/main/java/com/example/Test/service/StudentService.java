package com.example.Test.service;

import com.example.Test.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> list() {
        return List.of(
                new Student("Alex","Gladkov", LocalDate.of(2000, Month.APRIL,5)),
                new Student("Dima","Habarov",LocalDate.of(2001,Month.AUGUST,4)),
                new Student("Denis","Kabylov",LocalDate.of(2000,Month.JANUARY,7))
        );
    }

    public void add(Student student) {
        System.out.println(student);
    }
}
