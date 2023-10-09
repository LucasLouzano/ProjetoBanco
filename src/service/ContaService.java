package service;

import model.Conta;

import java.util.List;

public interface ContaService {

    void create(Conta parametro);

    List<Conta> readAll();

    boolean update(String nome, Conta parametro);

    boolean delete(String nome);

}
