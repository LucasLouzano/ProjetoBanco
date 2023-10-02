package controller;

import java.util.List;

import Service.impl.ClienteServiceImpl;
import model.Cliente;
import Service.impl.ClienteService;

import javax.xml.crypto.Data;

public class ClienteController {


    private ClienteService service = new ClienteServiceImpl();


    public void create(Cliente Conta) {
        service.create(Conta);

    }

    public List<Cliente> readAll() {
        return service.readAll();
    }

    public List<Cliente> update(int id, Cliente conta) {
        return service.update(id, conta);
    }

    public List<Cliente> delete(int id) {
        service.delete(id);
        return null;

    }
}





