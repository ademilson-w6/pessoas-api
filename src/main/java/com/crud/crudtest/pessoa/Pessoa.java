package com.crud.crudtest.pessoa;


import com.crud.crudtest.pet.Pet;
import com.crud.crudtest.sexo.Sexo;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import static java.lang.Double.compare;

@Entity
@Data
@RequiredArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private double saldo;

    @OneToMany
    private List<Pet> pet;




}
