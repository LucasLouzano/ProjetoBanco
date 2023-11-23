package com.banco.service;

import java.util.List;

import com.banco.model.Funcionario;

public interface FuncionarioService {
    void create(Funcionario Dados);

    List<Funcionario> readAll();

    Funcionario read(String cpf);

    boolean update(String identificacao, Funcionario Dados);

    boolean delete(String identificacao);

}
