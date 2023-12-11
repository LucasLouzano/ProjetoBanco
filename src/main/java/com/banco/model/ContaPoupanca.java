package com.banco.model;

public class ContaPoupanca extends ContaCorrente {
    private static final double RENDIMENTO_ANUAL = 10;

    public static double getRendimentoAnual() {
        return RENDIMENTO_ANUAL;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu deposito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o deposito!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar saque!");
        }
    }
}

