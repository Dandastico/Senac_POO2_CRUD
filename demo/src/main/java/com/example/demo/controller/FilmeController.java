package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Filme;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class FilmeController {
    // ROTA: POST http://localhost:8080/api/filme
    @PostMapping("/filme")
    public String postFilme(@RequestBody Filme filme) {
        return "Filme: " + filme.titulo +
            "\nGênero: " + filme.genero +
            "\nLançamento: " + filme.ano +
            "\n-----------------------------" +
            "\nFilme cadastrado com sucesso!";
    }
    
}
