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
    private String name;
    private String raca;
    private String idade;
    private String peso;
    private String sexo;
    private String porte;
    private String cor;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    private String foto;

    @ManyToOne(fetch = FetchType.EAGER)
    private Fornecedor dono;


}

