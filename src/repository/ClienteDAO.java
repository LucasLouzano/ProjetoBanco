package repository;

import java.util.List;

import model.Cliente;

public interface ClienteDAO {
    /**
     * Cria uma conta na fake database
     *
     * @param Conta
     */
    void create(Cliente Conta);

    List<Cliente> readAll();

    void update(int id, Cliente Conta);

    void delete(int id);

}
