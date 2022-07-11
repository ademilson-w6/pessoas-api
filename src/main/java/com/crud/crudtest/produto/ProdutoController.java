package com.crud.crudtest.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return this.produtoService.salvar(produto);
    }

    @PutMapping("/{id}")
    public Produto editar(@PathVariable Long id, @RequestBody Produto produto){
        produto.setId(id);
        return this.produtoService.editar(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        this.produtoService.deletar(id);
    }

    @GetMapping("/{id}")
    public Produto pesquisarPorId(@PathVariable Long id) {
        return this.produtoService.pesquisarPorId(id);
    }

    @GetMapping
    public List<Produto> listar() {
        return this.produtoService.listar();
    }

    @GetMapping("/teste")
    public String pesquisarPorNome(Long id) {
        return produtoService.retornarResult(id);
    }











    }



