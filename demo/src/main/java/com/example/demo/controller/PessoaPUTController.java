package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.PessoaPUT;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")

public class PessoaPUTController {
    private static List<PessoaPUT> pessoas = new ArrayList<>();
    private static int proximoid = 1;

    // ROTA: GET http://localhost:8080/api/pessoaput
    @GetMapping("pessoaput")
    public List<PessoaPUT> listarPessoas() {
        return pessoas;
    }
    
    // ROTA: POST http://localhost:8080/api/pessoa
    @PostMapping("/pessoaput")
    public String cadastrarPessoa(@RequestBody PessoaPUT pessoa) {
        pessoa.setId(proximoid++);
        pessoas.add(pessoa);

        return "Pessoa cadastrada: " +
            pessoa.getNome() +
            " - idade: " +
            pessoa.getIdade();
    }


    // ROTA: PUT  http://localhost:8080/api/pessoaput
    @PutMapping("/pessoaput/{id}")
    public String putMethodName(@PathVariable int id, @RequestBody PessoaPUT pessoa) {
        return "";
    }
    
}
