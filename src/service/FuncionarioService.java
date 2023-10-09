package service;

import model.Funcionario;

import java.util.List;

public interface FuncionarioService {
    void create(Funcionario Dados);

    List<Funcionario> readAll();

    boolean update(String identificacao, Funcionario Dados);

    boolean delete(int identificacao);
}

