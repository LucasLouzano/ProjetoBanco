package com.banco.model;

import java.time.LocalDate;
import java.util.Date;

public class PessoaAbstrata {

    private String nome;
    private String email;
    private String cpfCnpj;
    private LocalDate nascimento;
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

    public String getCpfCnpj() {
        return this.cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

}
