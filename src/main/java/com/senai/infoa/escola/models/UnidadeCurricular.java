package com.senai.infoa.escola.models;

import java.time.LocalDate;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class UnidadeCurricular {
    private Integer id;
    private LocalDate inicio;
    private LocalDate fim;
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
