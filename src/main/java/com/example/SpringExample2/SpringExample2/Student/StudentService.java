package com.example.SpringExample2.SpringExample2.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping // To get something out of the server
        public List<Student> getStudents(){ // get mapping for student controller
            return studentRepository.findAll(); // Returns a list
        }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
