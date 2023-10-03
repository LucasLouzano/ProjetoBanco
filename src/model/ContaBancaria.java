package model;

public  class ContaBancaria extends Conta {
    private int NumeroConta;
    private double agencia;
    private double saldo;


    public ContaBancaria(int numeroConta, double saldo, double agencia) {
        this.NumeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
    }

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

    @Override
    public String toString() {
        return "ContaBancaria " + "NumeroConta = " + getNumeroConta() + ", agencia = " + getAgencia() + ", saldo = " + getSaldo() + '}';
    }
}


