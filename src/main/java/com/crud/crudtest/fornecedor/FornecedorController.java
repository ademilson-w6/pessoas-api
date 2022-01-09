package com.crud.crudtest.fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public void salvar (@RequestBody Fornecedor fornecedor){
        this.fornecedorService.salvar(fornecedor);
    }

    @PutMapping("/{id}")
    public Fornecedor editar(@PathVariable Long id, @RequestBody Fornecedor fornecedor){
        fornecedor.setId(id);
        return this.fornecedorService.editar(fornecedor);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        this.fornecedorService.deletar(id);
    }

    @GetMapping("/{id}")
    public Fornecedor pesquisarPorId(@PathVariable Long id){
        return this.fornecedorService.pesquisarPorId(id);
    }

    @GetMapping
    public List<Fornecedor> listar(){
        return this.fornecedorService.listar();
    }




}
