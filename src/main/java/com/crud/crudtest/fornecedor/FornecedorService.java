package com.crud.crudtest.fornecedor;

import com.crud.crudtest.exceptions.EntidadeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public void salvar(Fornecedor fornecedor) {
        log.info("Salvando pessoa de ID {}", fornecedor.getId());
        this.fornecedorRepository.save(fornecedor);
    }

    public Fornecedor editar(Fornecedor fornecedor) {
        log.info("Editando pessoa com ID {}", fornecedor.getId());
        return this.fornecedorRepository.save(fornecedor);
    }

    public void deletar(Long id) {
        log.info("Deletando pessoa de ID {}", id);
        Fornecedor fornecedorEncontrada = this.fornecedorRepository.findById(id).orElseThrow(() -> new EntidadeException("Pessoa não encontrada"));
        this.fornecedorRepository.deleteById(fornecedorEncontrada.getId());
    }

    public Fornecedor pesquisarPorId(Long id) {
        log.info("Pesquisando pessoa de ID {}", id);
        return this.fornecedorRepository.findById(id).orElseThrow(() -> new EntidadeException("Pessoa não encontrada"));
    }

    public List<Fornecedor> listar() {
        log.info("Listando todas as pessoas");
        return this.fornecedorRepository.findAll();
    }






}
