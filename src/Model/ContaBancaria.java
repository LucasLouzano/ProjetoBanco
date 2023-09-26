package Model;

import java.util.Date;

public abstract class ContaBancaria {
    private String numeroConta;
    private String agencia;
    private Date dataCriacao;


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "numeroConta ='" + numeroConta + '\'' + ", agencia ='" + agencia + '\'' + ", dataCriacao = " + dataCriacao + '}';
    }
}

