package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/student")
public class StudentController {

    //reference to student service
    private final StudentService studentService;

    //injecting StudentService rather than having to instantiate a new class
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    //Post is used when we want to add new resources to our system
    // in our case students
    @PostMapping()
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }
}
