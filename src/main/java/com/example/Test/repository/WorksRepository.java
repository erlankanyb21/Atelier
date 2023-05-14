package com.example.Test.repository;

import com.example.Test.models.Works;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorksRepository extends JpaRepository<Works, Long> {

}
