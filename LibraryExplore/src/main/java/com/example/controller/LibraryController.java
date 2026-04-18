package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;

@RestController
public class LibraryController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System";
    }

    @GetMapping("/count")
    public int count() {
        return 120;
    }

    @GetMapping("/books")
    public List<String> books() {
        List<String> list = new ArrayList<>();
        list.add("Spring Boot");
        list.add("Java");
        list.add("Microservices");
        return list;
    }

    @GetMapping("/books/{id}")
    public Book bookById(@PathVariable int id) {
        return new Book(id, "Spring MVC", "Rod Johnson", 450);
    }

    @GetMapping("/search")
    public String search(@RequestParam String title) {
        return "Searching for book: " + title;
    }
}
