package com.mancer.appdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/1.0.0/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(final StudentService studentService ){
        this.studentService = studentService ;
    }

    @PostMapping
    public Student save(
            @RequestBody Student student
    ){
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
            @PathVariable  String email
    ){
        return studentService.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(
            @RequestBody  Student student
    ){
        return studentService.update(student);
    }

    @DeleteMapping(path = "/{email}")
    public void delete(
            @PathVariable String email){
        studentService.delete(email);
    }

    //Create a method to return a list of Student
    @GetMapping
    public List<Student> findAllStudent(){
        return studentService.finAllStudents();
    }
}
