package com.project.formulario1.controller;

import java.io.Serializable;

public class FormularioMB implements Serializable {
    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    private String nome;

    public FormularioMB() {
        System.out.println("Uma instancia de Exemplo foi criada!");
    }

    public void setNome(String nome) {
        System.out.println("Nome digitado: " + nome);
        this.nome = nome;
    }

    public String getNome() {
        System.out.println("Nome digitado: " + nome);
        return nome;
    }
}
