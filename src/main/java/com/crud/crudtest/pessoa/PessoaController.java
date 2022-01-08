package com.crud.crudtest.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public void salvar (@RequestBody Pessoa pessoa){
        this.pessoaService.salvar(pessoa);
    }

    @PutMapping("/{id}")
    public Pessoa editar(@PathVariable Long id, @RequestBody Pessoa pessoa){
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
