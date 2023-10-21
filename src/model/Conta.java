package model;

import java.util.Date;

public class Conta {
    private String nome;
    private String email;
    private String senha;
    private String cpfCnpj;
    private Date dataNascimento;
    private Date dataCriacao;


    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
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

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Conta " + "nome='" + nome + '\'' + ", email='" + email + '\'' + ", senha='" + senha + '\'' + ", cpfCnpj='" + cpfCnpj + '\'' + ", dataNascimento=" + dataNascimento + ", dataCriacao=" + dataCriacao + '}';
    }
}
