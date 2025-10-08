package com.senai.infoa.escola.models;

public class Professor {
    private Integer id;
    private String nome;

public Professor(){}

public Professor(String nome){
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}


}
