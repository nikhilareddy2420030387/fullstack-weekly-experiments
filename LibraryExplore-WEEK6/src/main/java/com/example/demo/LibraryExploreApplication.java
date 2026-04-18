package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.example.demo",
        "com.example.controller",
        "com.example.model"
})
public class LibraryExploreApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryExploreApplication.class, args);
    }
}

