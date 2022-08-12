package com.example.SpringExample2.SpringExample2.Student;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.time.LocalDate;

//To map student to the database:
@Entity // Mapping (Hibernate)
@Table // For table in database
public class Student {
    @Id //Generate random ID
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, // Recommended for postgres
            generator = "student_sequence" // Sequence that we just created
    )
    private Long id;
    private Integer age;
    private LocalDate dateOfBirth;
    private String email;
    private String name;

    public Student() {
    }

    public Student(String name, Integer age, LocalDate dateOfBirth, String email, Long id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.id = id;
    }

    public Student(String name, Integer age, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }





}
