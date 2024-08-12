package com.mancer.appdemo.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/1.0.0/students")
public class StudentController {

    //Create a method to return a list of Student
    @GetMapping
    public List<String> findAllStudent(){
        return List.of(
                "Bilal",
                "Mancer"
        );
    }
}
