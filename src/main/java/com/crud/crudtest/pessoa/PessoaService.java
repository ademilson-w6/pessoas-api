package com.crud.crudtest.pessoa;

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
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void salvar(Pessoa pessoa) {
        log.info("Salvando pessoa de ID {}", pessoa.getId());
        this.pessoaRepository.save(pessoa);
    }

    public Pessoa editar(Pessoa pessoa) {
        log.info("Editando pessoa com ID {}", pessoa.getId());
        return this.pessoaRepository.save(pessoa);
    }

    public void deletar(Long id) {
        log.info("Deletando pessoa de ID {}", id);
        Pessoa pessoaEncontrada = this.pessoaRepository.findById(id).orElseThrow(() -> new EntidadeException("Pessoa não encontrada"));
        this.pessoaRepository.deleteById(pessoaEncontrada.getId());
    }

    public Pessoa pesquisarPorId(Long id) {
        log.info("Pesquisando pessoa de ID {}", id);
        return this.pessoaRepository.findById(id).orElseThrow(() -> new EntidadeException("Pessoa não encontrada"));
    }

    public List<Pessoa> listar() {
        log.info("Listando todas as pessoas");
        return this.pessoaRepository.findAll();
    }


}
