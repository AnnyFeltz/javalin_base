package br.edu.ifpr.pgua.eic.tads.models;

public class Pessoa {
    //atributos
    private String nome;
    private String cpf;

    //controlador
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //getters & setters

    //nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
