package com.example.SpringExample2.SpringExample2.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig { // Insert beans

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) { // Get access to repository
        return args -> {
            Student hassan = new Student(
                    "Hassan",
                    LocalDate.of(2000, Month.JULY, 25),
                    "h.s.asif@gmail.com"
            );

            Student rubina = new Student(
                    "Rubina",
                    LocalDate.of(2000, Month.JULY, 14),
                    "r.ali@gmail.com"
            );

            Student khawar = new Student(
                    "Khawar",
                    LocalDate.of(2000, Month.JULY, 21),
                    "k.w.asif@gmail.com"
            );

            repository.saveAll(
                    List.of(hassan, rubina, khawar)
            );
        };
    }
}
