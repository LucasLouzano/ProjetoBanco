package com.banco.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimentacao {

    private Long id;
    private double montante;
    private Date data;
    private String numeroConta;
    private TipoMovimentacao tipoMovimentacao;

    public Movimentacao() {
    }

    public Movimentacao(Long id, double montante, Date data, String numeroConta, TipoMovimentacao tipoMovimentacao) {
        this.id = id;
        this.montante = montante;
        this.data = data;
        this.numeroConta = numeroConta;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("EEEE, dd/MM/yyyy HH:mm:ss");
        return "ID: " + id +
                ", Montante: " + montante +
                ", Data: " + formato.format(data) +
                ", Conta: " + numeroConta +
                ", Tipo: " + tipoMovimentacao;
    }
}
