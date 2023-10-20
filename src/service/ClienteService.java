package service;

import java.util.List;
import model.Cliente;

public interface ClienteService {

    void create(Cliente conta);

    List<Cliente> readAll();

    boolean update(String id, Cliente conta);

    boolean delete(String id);

    Cliente read(String cpf);
}
