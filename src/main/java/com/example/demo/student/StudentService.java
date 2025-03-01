package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Paolo",
                        "paoloespiritu@outlook.com",
                        21,
                        LocalDate.of(1998, Month.AUGUST,2)
                )
        );
    }
}
