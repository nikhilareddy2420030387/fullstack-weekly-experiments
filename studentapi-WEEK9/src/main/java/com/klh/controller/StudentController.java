package com.klh.controller;

import org.springframework.web.bind.annotation.*;

import com.klh.exception.InvalidInputException;
import com.klh.model.Student;
import com.klh.service.StudentService;

@RestController
@RequestMapping("/student")

public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {

        // check if id is numeric
        if (!id.matches("\\d+")) {
            throw new InvalidInputException("Student ID must be numeric");
        }

        int studentId = Integer.parseInt(id);

        return service.getStudentById(studentId);
    }
}