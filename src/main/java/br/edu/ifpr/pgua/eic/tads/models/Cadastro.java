package br.edu.ifpr.pgua.eic.tads.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    //atributos
    private List<Pessoa> pessoas;

    //controlador
    public Cadastro(){
        this.pessoas = new ArrayList<>();
    }

    //metodos

    //adicionar pessoa
    public void add(Pessoa p){
        try (Connection con = DriverManager.getConnection("jdbc:mysql://wagnerweinert.com.br:3306/tads24_ana", "tads24_ana", "tads24_ana")) {
        
            System.out.println("Conectado!!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        this.pessoas.add(p);
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