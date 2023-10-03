package service;

import model.Conta;

import java.util.List;

public interface ContaService {

    void create(Conta parametro);

    List<Conta> readAll();

    void update(String nome, Conta parametro);

    void delete(String nome);

}
