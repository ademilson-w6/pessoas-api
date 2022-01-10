package com.crud.crudtest.fornecedor;


import com.crud.crudtest.produto.Produto;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Fornecedor {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    @CPF
    private String cpf;
    private double saldo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fornecedor")
    private List<Produto> produtos;



}
