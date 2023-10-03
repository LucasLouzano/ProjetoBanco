package controller;

import java.util.List;

import service.impl.ClienteService;
import service.impl.ClienteServiceImpl;
import model.Cliente;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    public void create(Cliente Conta) {
        service.create(Conta);
    }

    public Cliente readAll() {
        return service.readAll();
    }

    public List<Cliente> update(int id, Cliente Conta) {
        service.update(id, Conta);
        return null;
    }

    public List<Cliente> delete(int id) {
        service.delete(id);
        return null;
    }

}
