package com.mancer.appdemo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Student {
    private String firstName ;

    private String lastName;

    private LocalDate date ;

    private String email ;

    private int age ;
}
