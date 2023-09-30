package repository.impl;

import model.Conta;

import java.util.List;

public interface ContaDAO {
    /**
     * Cria uma conta na fake database
     *
     * @param parametro
     */
    void create(Conta parametro);

    List<Conta> readAll();

    void update(String nome, Conta parametro);

    void delete(String nome);

}
