package com.crud.crudtest.pessoa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController("/pessoa")
@Controller
public class PessoaController {

    private PessoaService pessoaService;

    @PostMapping("/")
    public void salvar (@RequestBody Pessoa pessoa){
        this.pessoaService.salvar(pessoa);
    }

    @PutMapping("/")
    public Pessoa editar(@RequestBody Pessoa pessoa){
        return this.pessoaService.editar(pessoa);
    }

    @DeleteMapping("/")
    public void deletar (@RequestParam Long id){
        this.pessoaService.deletar(id);
    }

    @GetMapping("/")
    public Pessoa pesquisarPorId(@RequestParam Long id){
        return this.pessoaService.pesquisarPorId(id);
    }




}
