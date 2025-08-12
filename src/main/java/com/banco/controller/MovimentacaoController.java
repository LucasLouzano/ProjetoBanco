package com.banco.controller;

import com.banco.model.Movimentacao;
import com.banco.service.MovimentacaoService;
import com.banco.service.impl.MovimentacaoServiceImpl;

import java.util.List;

public class MovimentacaoController{
    private final MovimentacaoService service = new MovimentacaoServiceImpl();

    public void create(Movimentacao movimetacao) {
        service.create(movimetacao);

    }
    public List<Movimentacao> readAll() {
        return service.readAll();
    }

    public Movimentacao read(Long id) {
        return service.read(id);
    }

    public boolean update(Long id, Movimentacao movimentacao) {
        return service.update(id,movimentacao);
    }

    public boolean delete(Long id) {
        return service.delete(id);
    }
}
