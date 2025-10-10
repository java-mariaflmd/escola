package com.senai.infoa.escola.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="unidadeCurricular")
public class UnidadeCurricular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="inicio")
    private LocalDate inicio;

    @Column(name="fim")
    private LocalDate fim;

    @Column(name="nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;
    

public UnidadeCurricular(LocalDate inicio, LocalDate fim, String nome){
    this.inicio = inicio;
    this.fim = fim;
    this.nome = nome;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public LocalDate getInicio() {
    return inicio;
}

public void setInicio(LocalDate inicio) {
    this.inicio = inicio;
}

public LocalDate getFim() {
    return fim;
}

public void setFim(LocalDate fim) {
    this.fim = fim;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Professor getProfessor() {
    return professor;
}

public void setProfessor(Professor professor) {
    this.professor = professor;
}


}
