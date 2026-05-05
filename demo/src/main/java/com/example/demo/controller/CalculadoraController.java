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

    // ROTA: GET http://localhost:8080/api/somar?num1=1&num2=20
    @GetMapping("/somar")
    public String getSomar(@RequestParam int num1, @RequestParam int num2) {
        int total = num1 + num2;
        return "Soma de " + num1 + " com " + num2 + " é igual a " + total;
    }

    // ROTA: GET http://localhost:8080/api/multiplicar?num1=1&num2=20
    @GetMapping("/multiplicar")
    public String getMultiplicar(@RequestParam double num1, @RequestParam double num2) {
        double total = num1 * num2;
        return "Multiplicação de " + num1 + " com " + num2 + " é igual a " + total;
    }

    // ROTA: GET http://localhost:8080/api/divisao?num1=1&num2=20
    @GetMapping("/divisao")
    public String getDivisao(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Não é possível dividir um número por 0!";
        }
        float total = (float) num1/num2;
        return "Divisão de " + num1 + " com " + num2 + " é igual a " + total;
    }
    
    
}
