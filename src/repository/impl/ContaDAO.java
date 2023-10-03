package repository.impl;
import model.Cliente;
import model.Conta;

public interface ContaDAO {
    /**
     * Cria uma conta na fake database
     *
     * @param parametro
     */
    void create(Conta parametro);

    Cliente readAll();

    void update(String nome, Conta parametro);

    void delete(String nome);

}
