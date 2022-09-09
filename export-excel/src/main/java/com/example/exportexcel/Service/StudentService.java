package com.example.exportexcel.Service;

import com.example.exportexcel.Entity.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List<Student> getTheListStudent();
}
