package com.banco.repository;

import com.banco.model.Movimentacao;

import java.util.Date;
import java.util.List;

public interface MovimentacaoDAO extends GenericCRUD<Movimentacao, Long> {
    List<Movimentacao> buscarPorContaEPeriodo(String numeroConta, Date inicio, Date fim);

    List<Movimentacao> buscarTodasContas(String numeroConta);
}