package com.senai.infoa.escola.models;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

    @Column(name="email")
    private String email;

    @ManyToMany
    @JoinTable(
        name = "estudante_unidade_curricular",
        joinColumns = @JoinColumn(name = "estudante_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "unidade_curricular_id", referencedColumnName = "id")
    )
    private Set<UnidadeCurricular> unidadesCurriculares;


public Estudante(){}

public Estudante(String nome, String matricula, LocalDate data_nascimento, String email){
    this.nome = nome;
    this.matricula = matricula;
    this.data_nascimento = data_nascimento;
    this.email = email;
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

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public Set<UnidadeCurricular> getUnidadesCurriculares() {
    return unidadesCurriculares;
}

public void setUnidadesCurriculares(Set<UnidadeCurricular> unidadesCurriculares) {
    this.unidadesCurriculares = unidadesCurriculares;
}


}