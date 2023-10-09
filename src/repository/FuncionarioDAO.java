package repository;

import model.Funcionario;

import java.util.List;

public interface FuncionarioDAO {
    /**
     * Cria uma conta na fake data
     *
     * @param Dados
     * @return
     */
    void create(Funcionario Dados);

    List<Funcionario> readAll();

    boolean update(String identificacao, Funcionario Dados);

    boolean delete(int identificacao);

}