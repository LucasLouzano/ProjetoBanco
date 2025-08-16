package com.banco.service;

import com.banco.exceptions.ContaException;
import com.banco.model.Conta;
import com.banco.model.Movimentacao;

import java.util.Date;
import java.util.List;

public interface MovimentacaoService {
    void create(Movimentacao movimetacao) throws ContaException;

    List<Movimentacao> readAll();

    Movimentacao read(Long id);

    boolean update(Long id, Movimentacao movimentacao);

    boolean delete(Long id);

    List<Movimentacao> extratoPorPeriodo(String numeroConta, Date inicio, Date fim);

    List<Movimentacao> extratoGeralPorConta();

    List<Movimentacao> buscarConta(String numeroConta);


}
