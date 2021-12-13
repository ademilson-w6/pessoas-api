package com.crud.crudtest.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/")
    public void salvar (@RequestBody Pessoa pessoa){
        this.pessoaService.salvar(pessoa);
    }

    @PutMapping("/")
    public Pessoa editar(@RequestBody Pessoa pessoa){
        return this.pessoaService.editar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        this.pessoaService.deletar(id);
    }

    @GetMapping("/{id}")
    public Pessoa pesquisarPorId(@PathVariable Long id){
        return this.pessoaService.pesquisarPorId(id);
    }

    @GetMapping
    public List<Pessoa> listar(){
        return this.pessoaService.listar();
    }




}
