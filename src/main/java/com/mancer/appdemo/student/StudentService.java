package com.mancer.appdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> finAllStudents(){
        return List.of(
                new Student("Bilal" , "Mancer" , LocalDate.now(), "mancer134@gmail.com",18),
                new Student("abd" , "Mancer" , LocalDate.now(), "mancer13@gmail.com",25)
        );
    }
}
