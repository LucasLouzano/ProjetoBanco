package Controller;

import java.util.List;

import Model.Cliente;
import service.impl.ClienteService;
import service.impl.ClienteServiceImpl;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    public void create(Cliente cliente) {
        service.create(cliente);
    }

    public List<Cliente> readAll() {
        return service.readAll();
    }

    public void update(int id, Cliente cliente) {
        service.update(id, cliente);
    }

    public void delete(int id) {
        service.delete(id);
    }

}
