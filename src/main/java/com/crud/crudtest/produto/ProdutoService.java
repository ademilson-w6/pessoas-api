package com.crud.crudtest.produto;


import com.crud.crudtest.exceptions.EntidadeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        log.info("Salvando produtode ID: {}", produto.getId());
        return this.produtoRepository.save(produto);
    }

    public Produto editar(Produto produto) {
        log.info("Editando produto de ID: {}", produto.getId());
        Produto produtoEncontrado = this.produtoRepository.findById(produto.getId()).orElseThrow(() -> new EntidadeException("Produto não encontrado"));
        return this.produtoRepository.save(produtoEncontrado);
    }

    public void deletar(Long id) {
        Produto produtoEncontrado = this.produtoRepository.findById(id).orElseThrow(() -> new EntidadeException("Produto não encontrado"));
        log.info("Deletando produto de ID: {}", produtoEncontrado.getId());
        this.produtoRepository.deleteById(produtoEncontrado.getId());
    }

    public Produto pesquisarPorId(Long id) {
        log.info("Pesquisando produto de ID: {}", id);
        return this.produtoRepository.findById(id).orElseThrow(() -> new EntidadeException("Produto não encontrado"));
    }
    public List<Produto> listar() {
        log.info("Listando todos os produtos");
        return this.produtoRepository.findAll();
    }

    public String retornarResult(Long id) {


        if(id != null) {
            return "Produto encontrado com sucesso DIF";
        }


        if(Optional.ofNullable(id).isPresent()) {
            return "Produto encontrado com sucesso PRESENT";
        }



        return "null";
    }


}
