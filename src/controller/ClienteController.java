package controller;

import java.util.List;

import service.ClienteService;
import service.impl.ClienteServiceImpl;
import model.Cliente;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    public void create(Cliente conta) {
        service.create(conta);
    }

    public List<Cliente> readAll() {
        return service.readAll();
    }

    public boolean update(String id, Cliente conta) {
        return service.update(id, conta);
    }

    public boolean delete(String id) {
        return service.delete(id);
    }

    public Cliente read(String cpf) {
        return service.read(cpf);
    }
}
