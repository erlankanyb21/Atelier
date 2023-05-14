package com.example.Test.repository;

import com.example.Test.models.Contacts;
import com.example.Test.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Long> {
    Optional<Project> findStudentByEmail(String email);
}
