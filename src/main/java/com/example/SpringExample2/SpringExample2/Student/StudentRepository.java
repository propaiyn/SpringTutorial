package com.example.SpringExample2.SpringExample2.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // because interface is responsible for data access
public interface StudentRepository extends JpaRepository<Student, Long> { //Type and Long(ID)
}
