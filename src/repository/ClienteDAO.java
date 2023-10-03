package repository;

import java.util.List;

import model.Cliente;

public interface ClienteDAO {
    /**
     * Cria uma conta na fake data
     *
     * @param conta
     */
    void create(Cliente conta);

    List<Cliente> readAll();

    boolean update(String id, Cliente conta);

    boolean delete(int id);

}
