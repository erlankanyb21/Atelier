package com.example.Test.config;

import com.example.Test.models.Student;
import com.example.Test.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            studentRepository.saveAll(
                    List.of(new Student("Thomas","Shelby", "tom@gmail.com",LocalDate.of(1999, Month.APRIL,8)),
                            new Student("Emily","Blunt","em@gmail.com", LocalDate.of(2000, Month.AUGUST,11)),
                            new Student("Steve","Rogers","steve@gmail.com", LocalDate.of(1870, Month.MAY,4)))
            );
        };
    }

}
