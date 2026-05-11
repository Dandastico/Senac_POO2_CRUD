package com.example.demo.controller;

import com.example.demo.model.Produto;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")

public class ProdutoController {
    // ROTA: POST http://localhost:8080/api/produto
    @PostMapping("/produto")
    public String postProduto(@RequestBody Produto produto) {
        return "Produto: " + produto.nome
            + "\nValor: " + produto.preco
            + "\n-----------------------------------"
            + "\nProduto cadastrado com sucesso!";
    }
    
}
