package com.banco.model;

import java.time.LocalDate;

public  class ContaBancaria {
    private int NumeroConta;
    private double tipoConta;
    private double saldo;
    private LocalDate dataAbertura;
    private Cliente titular;

    public int getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        NumeroConta = numeroConta;
    }

    public double getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(double tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
