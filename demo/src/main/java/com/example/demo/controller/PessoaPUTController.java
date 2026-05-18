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
    @GetMapping("/pessoaput")
    public List<PessoaPUT> listarPessoas() {
        return pessoas;
    }
    
    // ROTA: POST http://localhost:8080/api/pessoaput
    @PostMapping("/pessoaput")
    public String cadastrarPessoa(@RequestBody PessoaPUT pessoa) {
        pessoa.setId(proximoid++);
        pessoas.add(pessoa);

        return "Pessoa cadastrada: " +
            pessoa.getNome() +
            " - idade: " +
            pessoa.getIdade();
    }

    // ROTA: PUT  http://localhost:8080/api/pessoaput/{id}
    @PutMapping("/pessoaput/{id}")
    public String atualizarPessoa(@PathVariable int id, @RequestBody PessoaPUT pessoa) {
        for (PessoaPUT p : pessoas) {
            if (p.getId() == id) {
                p.setNome(pessoa.getNome());
                p.setIdade(pessoa.getIdade());
                return "Pessoa atualizada: " + p.getNome() + " - idade: " + p.getIdade();
            }
        }
        return "Pessoa com id " + id + " não encontrada.";
    }

    // ROTA: DELETE http://localhost:8080/api/pessoaput/{id}
    @DeleteMapping("/pessoaput/{id}")
    public String deletarPessoa(@PathVariable int id) {
        for (PessoaPUT p : pessoas) {
            if (p.getId() == id) {
                pessoas.remove(p);
                return "Pessoa com id " + id + " foi removida com sucesso";
            }
        }
        return "Pessoa com id " + id + " não foi encontrada";
    }
}
