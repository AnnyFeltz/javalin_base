package br.edu.ifpr.pgua.eic.tads.models;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    //atributos
    private List<Pessoa> pessoas;

    //controlador
    public Cadastro(){
        this.pessoas = new ArrayList<>();
    }

    //getters & setters

    //lista de pessoas
    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}