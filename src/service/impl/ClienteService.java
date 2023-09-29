package Service.impl;

import java.util.List;

import model.Cliente;

public interface ClienteService {
    void create(Cliente conta);

    List<Cliente> readAll();

    List<Cliente> update(int id, Cliente Conta);

    List<Cliente> delete(int id);
}
