package com.banco.service.impl;
import java.util.List;

import com.banco.model.Conta;
import com.banco.repository.ContaDAO;
import com.banco.repository.impl.ContaDAOimpl;
import com.banco.service.ContaService;

public class ContaServiceimpl implements ContaService {
    private ContaDAO repository = new ContaDAOimpl();

    @Override
    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        repository.create(parametro);
    }
    @Override
    public List<Conta> readAll() {
        return repository.readAll();
    }
    @Override
    public boolean update(String nome, Conta parametro) {
        return repository.update(nome, parametro);
    }
    @Override
    public boolean delete(String cpf) {
        return repository.delete(cpf);
    }
    @Override
    public Conta read(String cpf) {
        return repository.read(cpf);
    }

    @Override
    public Conta createConta(String nome) {
        return repository.createConta(nome);
    }

}
