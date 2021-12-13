package com.crud.crudtest.pessoa;


import com.crud.crudtest.sexo.Sexo;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Pessoa {

    private Long id;
    private String nome;
    public Sexo sexo;
    private String email;
    private Date dataNascimento;
    private String naturalidade;
    private String nacionalidade;
    private String cpf;


}
