package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;
import service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO repository = new ClienteDAOImpl();
    List<Cliente> clientes = new ArrayList<>();

    @Override // create-criar //remover pontos e traços
    public void create(Cliente conta) {
        repository.create(conta);

    }
    @Override  // adicionar pontos e traços
    public List<Cliente> readAll() {
        return repository.readAll();

    }

    @Override // procurar o valor para atualizar //atualizar
    public boolean update(String id, Cliente conta) {
        return repository.update(id, conta);
    }

    @Override    // chamar o read, passar o objeto com parametro
    public boolean delete(int id) {
        return repository.delete(id);

    }
}

// Encontrar o cliente com o ID correspondente na lista.
// procurar o valor para atualizar delele
// Remover o cliente se ele foi encontrado.



