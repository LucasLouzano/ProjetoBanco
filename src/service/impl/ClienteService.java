package service.impl;

import java.util.List;

import Model.Cliente;

public interface ClienteService {
    void create(Cliente contas);

    List<Cliente> readAll();

    void update(int id, Cliente contas);

    void delete(int id);
}
