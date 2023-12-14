package com.banco.model;

    public class ContaCorrente extends Conta {
        private boolean debitoAutomatico;

        public boolean getDebitoAutomatico() {
            return debitoAutomatico;
        }

        public void setDebitoAutomatico(boolean debitoAutomatico) {
            this.debitoAutomatico = debitoAutomatico;
        }

        public void debitoAutomatico(double valor) {
            if (debitoAutomatico && this.getSaldo() >= valor) {
                debitar(valor);
                System.out.println("Débito automático de " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Débito automático não ativado ou saldo insuficiente!");
            }
        }
    }
