package controller;

import java.util.List;

import service.ClienteService;
import service.impl.ClienteServiceImpl;
import model.Cliente;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    public void create(Cliente Conta) {
        service.create(Conta);
    }

    public List<Cliente> readAll() {
        return service.readAll();
    }

    public boolean update(String id, Cliente Conta) {
        return service.update(id, Conta);
    }

    public List<Cliente> delete(int id) {
        service.delete(id);
        return null;
    }

}
