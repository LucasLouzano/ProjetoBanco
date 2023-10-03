package repository;

import model.Cliente;

public interface ClienteDAO {
    /**
     * Cria uma conta na fake data
     *
     * @param conta
     */
    void create(Cliente conta);

    Cliente readAll();

    boolean update(int id, Cliente conta);

    boolean delete(int id);

}
