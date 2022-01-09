package com.crud.crudtest.pessoa;


import com.crud.crudtest.pet.Pet;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    @CPF
    private String cpf;
    private double saldo;

    @OneToMany
    private List<Pet> pet;


}
