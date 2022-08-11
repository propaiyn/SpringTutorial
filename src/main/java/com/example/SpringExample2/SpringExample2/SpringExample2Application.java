package com.example.SpringExample2.SpringExample2;

import com.example.SpringExample2.SpringExample2.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController //Makes class serve rest endpoints
public class SpringExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringExample2Application.class, args);
	}
	@GetMapping // To get something out of the server
	public List<Student> hello(){ // This is the end point
		return List.of(
				new Student("Hassan",
						22,
						LocalDate.of(2000,07,25),
						"h.s.asif@student.reading.ac.uk",
						1l
		)); // This returns a JSON representation
	}

}
