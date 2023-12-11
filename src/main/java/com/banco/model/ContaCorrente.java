package com.banco.model;

    public class ContaCorrente extends Conta {
        private boolean debitoAutomatico;

        public boolean getDebitoAutomatico() {
            return debitoAutomatico;
        }

        public void setDebitoAutomatico(boolean debitoAutomatico) {
            this.debitoAutomatico = debitoAutomatico;
        }

        public void credito(double valor) {
            if (valor > 0) {
                credito(valor);
                System.out.println("Crédito de " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Não foi possível realizar o crédito!");
            }
        }

        public void debito(double valor) {
            if (valor > 0 && this.getSaldo() >= valor) {
                debito(valor);
                System.out.println("Débito de " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Não foi possível realizar o débito!");
            }
        }
        public void transferir(Conta destino, double valor) {
            if (valor > 0 && this.getSaldo() >= valor) {
                transferir(destino, valor);
                System.out.println("Transferência de " + valor + " realizada com sucesso para a conta " + destino.getNumeroConta());
            } else {
                System.out.println("Não foi possível realizar a transferência!");
            }
        }

        public void debitoAutomatico(double valor) {
            if (debitoAutomatico && this.getSaldo() >= valor) {
                debito(valor);
                System.out.println("Débito automático de " + valor + " realizado com sucesso!");
            } else {
                System.out.println("Débito automático não ativado ou saldo insuficiente!");
            }
        }
    }
