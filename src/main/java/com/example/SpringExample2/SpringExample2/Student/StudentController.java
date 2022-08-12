package com.example.SpringExample2.SpringExample2.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

// Contains all the resources for the API
@RestController
@RequestMapping(path = "api/v1/student") //localhost:8080//api/v1/student

public class StudentController {
    private final StudentService studentService; // Reference is an injected bean now (@Component)
    // StudentService is a class that must be instantiated (Spring bean)
    @Autowired // Above student StudentService should be autowired into constructor
    public StudentController(StudentService studentService) { // Reference is parameter of constructor (controller)
        this.studentService = studentService; // Instead of writing  = new StudentService();
                                              // Try and use dependency injection as much as possible
    }


    @GetMapping // To get something out of the server
    public List<Student> getStudents() { // get mapping for student controller
        return studentService.getStudents();
    }
}
