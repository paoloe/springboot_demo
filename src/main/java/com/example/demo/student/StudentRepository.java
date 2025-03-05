package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //annotation for the data access
public interface StudentRepository
        extends JpaRepository<Student, Long> {

}
