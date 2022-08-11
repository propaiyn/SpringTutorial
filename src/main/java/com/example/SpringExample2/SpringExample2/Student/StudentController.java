package com.example.SpringExample2.SpringExample2.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

// Contains all the resources for the API
@RestController
@RequestMapping(path = "api/v1/student") //localhost:8080//api/v1/student

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping // To get something out of the server
    public List<Student> getStudents() { // get mapping for student controller
        return studentService.getStudents();
    }
}
