package model;

public  class ContaBancaria {
    private int NumeroConta;
    private double agencia;
    private double saldo;


    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAgencia() {
        return agencia;
    }

    public void setAgencia(double agencia) {
        this.agencia = agencia;
    }

}
