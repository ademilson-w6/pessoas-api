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
        log.info("Salvando fornecedor de ID {}", fornecedor.getId());
        this.fornecedorRepository.save(fornecedor);
    }

    public Fornecedor editar(Fornecedor fornecedor) {
        log.info("Editando fornecedor com ID {}", fornecedor.getId());
        Fornecedor fornecedorEncontrado = this.fornecedorRepository.findById(fornecedor.getId()).orElseThrow(() -> new EntidadeException("Fornecedor não encontrado"));
        return this.fornecedorRepository.save(fornecedorEncontrado);
    }

    public void deletar(Long id) {
        log.info("Deletando fornecedor de ID {}", id);
        Fornecedor fornecedorEncontrada = this.fornecedorRepository.findById(id).orElseThrow(() -> new EntidadeException("Fornecedor não encontrado"));
        this.fornecedorRepository.deleteById(fornecedorEncontrada.getId());
    }

    public Fornecedor pesquisarPorId(Long id) {
        log.info("Pesquisando fornecedor de ID {}", id);
        return this.fornecedorRepository.findById(id).orElseThrow(() -> new EntidadeException("Fornecedor não encontrada"));
    }

    public List<Fornecedor> listar() {
        log.info("Listando todos os fornecedores");
        return this.fornecedorRepository.findAll();
    }






}
