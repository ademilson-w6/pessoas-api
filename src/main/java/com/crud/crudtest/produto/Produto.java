package com.crud.crudtest.produto;

import com.crud.crudtest.fornecedor.Fornecedor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Produto {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private double preco;
    private String vencimento;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;
    private String foto;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;


}

