package com.mancer.appdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/1.0.0/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //Create a method to return a list of Student
    @GetMapping
    public List<Student> findAllStudent(){
        return studentService.finAllStudents();
    }
}
