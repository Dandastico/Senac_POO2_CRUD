package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class Hello { 

    @GetMapping("/hello")
    public String hello() {
        return "Seja bem-vindo ao Spring";
    }
}
