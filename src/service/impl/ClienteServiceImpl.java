package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;

public class ClienteServiceImpl implements ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private ClienteDAO repository = new ClienteDAOImpl();

    @Override // remover pontos e traços
    public void create(Cliente conta) {
        String SemPontos = conta.getCpfCnpj().replaceAll("[.-]", "");
        conta.setCpfCnpj(SemPontos);
        conta.setNome(conta.getNome() + " Louzano ");
        repository.create(conta);
    }

    @Override // adicionar pontos e traços
    public Cliente readAll() {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == cliente.getId()) {
                return cliente;
            }
        }
        return null;
    }

    @Override // procurar o valor para atualizar //atualizar
    public boolean update(int id, Cliente conta) {
        for (Cliente cliente : clientes)
            if (cliente.getId() == id) {
                cliente.setNome(conta.getNome());
                clientes.add(id, conta);
                return true;
            }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clienteParaRemover = cliente;
                break;
            }
        }
        if (clienteParaRemover != null) {
            clientes.remove(clienteParaRemover);
            return true;
        }
        return false;
    }
}

// Encontrar o cliente com o ID correspondente na lista.
// procurar o valor para atualizar delele
// Remover o cliente se ele foi encontrado.
