package com.example.exportexcel.Repository;

import com.example.exportexcel.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
