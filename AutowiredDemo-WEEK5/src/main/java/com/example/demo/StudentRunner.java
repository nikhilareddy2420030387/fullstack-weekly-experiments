package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Student;

@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    private Student student;

    @Override
    public void run(String... args) {
        System.out.println(student);
    }
}
