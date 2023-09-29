package repository;

import java.util.List;

import model.Cliente;

public interface ClienteDAO {
    /**
     * Cria uma conta na fake database
     *
     * @param conta
     */
    void create(Cliente conta);

    List<Cliente> readAll();

    void update(int id, Cliente conta);

    void delete(int id);

}
