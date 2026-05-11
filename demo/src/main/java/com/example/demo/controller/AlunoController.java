package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Aluno;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")

public class AlunoController {
    // ROTA: POST http://localhost:8080/api/aluno
    @PostMapping("/aluno")
    public String postAluno(@RequestBody Aluno aluno) {
        return "Aluno: " + aluno.nome +
            "\nCurso: " + aluno.curso +
            "\nIdade: " + aluno.idade +
            "\n--------------------------------------" +
            "\nAluno cadastrado com sucesso";
    }
    
}
