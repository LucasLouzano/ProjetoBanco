package service.impl;

import java.util.List;

import model.Cliente;

public interface ClienteService {
    void create(Cliente conta);

    List<Cliente> readAll();

    boolean update(String id, Cliente conta);

    boolean delete(int id);
}
