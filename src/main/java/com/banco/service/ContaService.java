package com.banco.service;

import java.util.List;

import com.banco.model.Conta;

public interface ContaService {

    void create(Conta parametro);

    List<Conta> readAll();

    boolean update(String nome, Conta parametro);

    boolean delete(String cpf);

    Conta read(String cpf);

}
