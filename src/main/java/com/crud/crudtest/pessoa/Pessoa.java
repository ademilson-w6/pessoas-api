package com.crud.crudtest.pessoa;


import com.crud.crudtest.sexo.Sexo;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@RequiredArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    public Sexo sexo;
    private String email;
    private Date dataNascimento;
    private String naturalidade;
    private String nacionalidade;
    private String cpf;


}
