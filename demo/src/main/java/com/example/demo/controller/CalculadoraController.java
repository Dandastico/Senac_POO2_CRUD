package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")

public class CalculadoraController {
    // ROTA: GET http://localhost:8080/api/subtrair?num1=1&num2=20
    @GetMapping("/subtrair")
    public String getSubtracao(@RequestParam int num1, @RequestParam int num2) {
        int total = num1 - num2;
        return "Subtração de " + num1 + " com " + num2 + " é igual a " + total;
    }
        
}
