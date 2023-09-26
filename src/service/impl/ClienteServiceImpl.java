package service.impl;

import java.util.List;

import Model.Cliente;
import Repository.ClienteDAO;
import Repository.impl.ClienteDAOImpl;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO repository = new ClienteDAOImpl();

    @Override
    public void create(Cliente cliente) {
        cliente.setNome(cliente.getNome() + " Louzano");
        // remover pontos e traços
        repository.create(cliente);
    }

    @Override
    public List<Cliente> readAll() {
        // adicionar pontos e traços
        return repository.readAll();
    }

    @Override
    public void update(int id, Cliente cliente) {
        repository.update(id, cliente);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

}
