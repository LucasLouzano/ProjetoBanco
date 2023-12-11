package com.banco.controller;

import java.util.List;


import com.banco.model.Conta;
import com.banco.service.ContaService;
import com.banco.service.impl.ContaServiceimpl;


public class ContaController {
    private ContaService service = new ContaServiceimpl();

    public void create(Conta nome) throws Exception {
        service.create(nome);

    }

    public List<Conta> listarContasPorCpf(String cpfInformado) {
        return service.listarContasPorCpf(cpfInformado);
    }

    public List<Conta> readAll() {
        return service.readAll();
    }

    public boolean update(String nome, Conta conta) {
        return service.update(nome, conta);
    }

    public boolean delete(String cpf) {
        return service.delete(cpf);
    }

    public Conta read(String cpf) {
        return service.read(cpf);
    }

    public Conta readContaPeloNome(String nome) {
        return service.readContaPeloNome(nome);
    }
}
