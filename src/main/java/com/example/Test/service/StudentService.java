package com.example.Test.service;

import com.example.Test.models.Student;
import com.example.Test.repository.StudentRepository;
import com.example.Test.response.RestApiException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> list() {
        return studentRepository.findAll();
    }

    public void add(Student student) {
        if (studentRepository.findStudentByEmail(student.getEmail()).isPresent()){
            throw new RestApiException("this email is already taken!");
        }
        studentRepository.save(student);
    }

    public void delete(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    public void update(Student student) {
        Optional<Student> row = studentRepository.findById(student.getId());
        if (row.isPresent()) {
            Student item = row.get();
            if (!student.getName().isEmpty()){
                item.setName(student.getName());
            }
            if (!student.getSurname().isEmpty()){
                item.setSurname(student.getSurname());
            }
            if (!student.getEmail().isEmpty()){
                item.setEmail(student.getEmail());
            }
            if (student.getDob() != null){
                item.setDob(student.getDob());
            }
            studentRepository.save(item);
        }
    }
}
