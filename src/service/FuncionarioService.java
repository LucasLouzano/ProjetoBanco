package service;

import model.Funcionario;

import java.util.List;

public interface FuncionarioService {
    void create(Funcionario Dados);

    List<Funcionario> readAll();

    Funcionario read(String cpf);

    boolean update(String identificacao, Funcionario Dados);

    boolean delete(String identificacao);
}
