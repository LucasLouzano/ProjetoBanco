package com.banco.model;

public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO_ANUAL = 10;

    public static double getRendimentoAnual() {
        return RENDIMENTO_ANUAL;
    }

    public void depositar(double valor) {
    	valor += (valor * (RENDIMENTO_ANUAL / 100)); 
        creditar(valor);
    }

    public void sacar(double valor) {
        debitar(valor);
    }
}

