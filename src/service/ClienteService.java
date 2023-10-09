package service;

import model.Cliente;

import java.util.List;

public interface ClienteService {

    void create(Cliente conta);

    List<Cliente>readAll();

    boolean update(String id, Cliente conta);

    boolean delete(int id);
}
