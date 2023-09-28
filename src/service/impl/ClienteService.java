package Service.impl;

import java.util.List;

import model.Cliente;

public interface ClienteService {
    void create(Cliente Conta);

    List<Cliente> readAll();

    List<Cliente> update(int id, Cliente Conta);

    void delete(int id);
}
