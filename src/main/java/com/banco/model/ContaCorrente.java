package com.banco.model;

public class ContaCorrente extends Conta {
    private boolean debitoAutomatico;

    public boolean getDebitoAutomatico() {
        return debitoAutomatico;
    }

    public void setDebitoAutomatico(boolean debitoAutomatico) {
        this.debitoAutomatico = debitoAutomatico;
    }

    public void realizarDebitoAutomatico(double valor) {
        if (debitoAutomatico && this.getSaldo() >= valor) {
            debitar(valor);
            System.out.println("Realizar Débito automático de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Débito automático não ativado ou saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        creditar(valor);
    }

    public void sacar(double valor) {
        debitar(valor);

    }
}