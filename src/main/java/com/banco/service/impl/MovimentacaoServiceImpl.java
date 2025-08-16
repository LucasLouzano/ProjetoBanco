package com.banco.service.impl;

import com.banco.exceptions.ContaException;
import com.banco.model.Conta;
import com.banco.model.Movimentacao;
import com.banco.repository.MovimentacaoDAO;
import com.banco.repository.impl.MovimentacaoDAOImpl;
import com.banco.service.ContaService;
import com.banco.service.MovimentacaoService;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MovimentacaoServiceImpl implements MovimentacaoService {

    private final MovimentacaoDAO repository = new MovimentacaoDAOImpl();

    private ContaService conta = new ContaServiceimpl();

    @Override
    public void create(Movimentacao movimentacao) throws ContaException {
        if(conta.readByNumber(movimentacao.getNumeroConta())!=null){
            repository.create(movimentacao);
        }else{
            throw new ContaException();
        }
    }
    @Override
    public List<Movimentacao> readAll() {
        return repository.readAll();
    }

    @Override
    public Movimentacao read(Long id) {
        return repository.read(id);
    }

    @Override
    public boolean update(Long id, Movimentacao movimentacao) {
        return repository.update(id,movimentacao);
    }

    @Override
    public boolean delete(Long id) {
        return repository.delete(id);
    }

    @Override
    public List<Movimentacao> extratoPorPeriodo(String numeroConta, Date inicio, Date fim) {
        return repository.buscarPorContaEPeriodo(numeroConta, inicio, fim);
    }

    @Override
    public List<Movimentacao> extratoGeralPorConta() {
    return repository.readAll()
                .stream().filter(m -> m.getNumeroConta() != null &&
                    !m.getNumeroConta().isEmpty())
            .collect(Collectors.toList());
    }

    @Override
    public List<Movimentacao> buscarConta(String numeroConta) {
        return repository.buscarTodasContas(numeroConta);
    }
}


//criar extrato de todas as movimetação das contas'