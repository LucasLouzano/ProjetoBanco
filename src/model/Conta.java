package model;

import java.util.Date;

public class Conta extends ContaBancaria {
    private String nome;
    private String email;
    private int senha;
    private String cpfCnpj;
    private Date dataNascimento;


    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Conta{" +
                " nome ='" + nome + '\'' + ", email ='" + email + '\'' + ", senha = " + senha + ", cpfCnpj ='" + cpfCnpj + '\'' + ", dataNascimento = " + dataNascimento + " numeroConta ='" + getNumeroConta() + '\'' + ", agencia ='" + getAgencia() + '\'' + ", dataCriacao =" + getDataCriacao() + '}';
    }
}
