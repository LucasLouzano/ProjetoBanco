package repository;

import java.util.List;

import model.Cliente;

public interface ClienteDAO {
    /**
     * Cria uma conta na fake database
     *
     * @param contas
     */
    void create(Cliente contas);

    List<Cliente> readAll();

    void update(int id, Cliente contas);

    void delete(int id);

}
