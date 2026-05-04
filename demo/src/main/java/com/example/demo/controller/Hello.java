package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class Hello { 

    @GetMapping("/hello")
    public String hello() {
        return "Seja bem-vindo ao Spring";
    }

    @GetMapping("/hello/{nome}")
    public String helloNome(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }
}
