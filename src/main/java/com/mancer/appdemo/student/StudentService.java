package com.mancer.appdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    Student save(Student s); // this methode to add new student

    List<Student> finAllStudents();

    Student findByEmail(String email); // this method to find new student

    Student update(Student s); // this method to update the student info

    void delete(String email); //this method to delete the student from the List

}
