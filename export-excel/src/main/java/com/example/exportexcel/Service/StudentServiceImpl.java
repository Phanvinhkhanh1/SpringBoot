package com.example.exportexcel.Service;

import com.example.exportexcel.Entity.Student;
import com.example.exportexcel.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getTheListStudent() {
        return studentRepository.findAll();
    }
}
