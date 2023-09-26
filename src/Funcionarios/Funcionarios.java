package Funcionarios;


import Model.ContaBancaria;

public class Funcionarios extends ContaBancaria {
    private String nome;
    private int identificacao;
    private String departamento;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome ='" + nome + '\'' +
                ", identificacao ='" + identificacao + '\'' +
                ", departamento ='" + departamento + '\'' +
                ", cargo ='" + cargo + '\'' +
                '}';
    }
}
