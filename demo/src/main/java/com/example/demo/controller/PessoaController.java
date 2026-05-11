package com.example.demo.controller;

import com.example.demo.model.Pessoa;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class PessoaController {
    // ROTA: POST http://localhost.8080/api/pessoa
    @PostMapping("/pessoa")
    public String postMethodName(@RequestBody Pessoa pessoa) {
        return "Pessoa cadastrada: " +
            pessoa.nome +
            " - idade: " +
            pessoa.idade;
    }
    
}
