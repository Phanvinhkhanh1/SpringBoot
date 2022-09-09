package com.example.exportexcel;

import com.example.exportexcel.Entity.Student;
import com.example.exportexcel.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExportExcelApplication implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(ExportExcelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i <= 10; i++) {

            Student student = new Student();

            student.setStudentName("Student Name");

            student.setEmail("student@mail.com");

            student.setMobileNumber("XXXXXXXXXX");

            studentService.addStudent(student);

        }

    }
}
