package com.crud.crudtest.pessoa;

import com.crud.crudtest.exceptions.EntidadeException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void salvar (Pessoa pessoa) {
        log.info("Salvando pessoa de ID {}", pessoa.getId());
        this.pessoaRepository.save(pessoa);
    }

    public Pessoa editar(Pessoa pessoa){
        log.info("Editando pessoa com ID {}", pessoa.getId());
        return this.pessoaRepository.save(pessoa);
    }

    public void deletar(Long id){
        verificar(id);
        log.info("Deletando pessoa de ID {}", id);
        this.pessoaRepository.deleteById(id);
    }

    public Pessoa pesquisarPorId(Long id){
        log.info("Pesquisando pessoa de ID {}", id);
        return this.pessoaRepository.getById(id);
    }

    public List<Pessoa> listar(){
        log.info("Listando todas as pessoas");
        return this.pessoaRepository.findAll();
    }

    protected void verificar(Long id) {
        if (pessoaRepository.findById(id).isEmpty()) {
            log.error("Não foi encontrada a entidade com o ID: " + id);
            throw new EntidadeException("Não foi encontrada a entidade");
        }
    }

}
