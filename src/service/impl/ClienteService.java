package Service.impl;

import model.Cliente;

public interface ClienteService {
    void create(Cliente conta);

    Cliente readAll();

    boolean update(int id, Cliente conta);

    boolean delete(int id);
}
