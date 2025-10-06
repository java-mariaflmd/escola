package com.senai.infoa.escola.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estudante")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="matricula")
    private String matricula;

    @Column(name="data_nascimento")
    private LocalDate data_nascimento;

public Estudante(){}

public Estudante(String nome, String matricula, LocalDate data_nascimento){
    this.nome = nome;
    this.matricula = matricula;
    this.data_nascimento = data_nascimento;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getMatricula() {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public LocalDate getData_nascimento() {
    return data_nascimento;
}

public void setData_nascimento(LocalDate data_nascimento) {
    this.data_nascimento = data_nascimento;
}


}