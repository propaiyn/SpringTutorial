package com.example.SpringExample2.SpringExample2.Student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
        @GetMapping // To get something out of the server
        public List<Student> getStudents(){ // get mapping for student controller
            return List.of(
                    new Student("Hassan",
                            22,
                            LocalDate.of(2000,07,25),
                            "h.s.asif@student.reading.ac.uk",
                            1l
                    )); // This returns a JSON representation
            //^^ This is currently a static list, eventually will come from a database
        }
}
