package service;

import model.Cliente;
import model.Conta;

import java.util.List;

public interface ContaService {

    void create(Conta parametro);

    List<Conta> readAll();

    boolean update(String nome, Conta parametro);

    boolean delete(String cpf);

    Conta read(String cpf);

}
