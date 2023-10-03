package Service.impl;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;

public class ClienteServiceImpl implements ClienteService {
    private ClienteDAO repository = new ClienteDAOImpl();
   private List<Cliente> Data = new ArrayList<>();

    @Override // remover pontos e traços
    public void create(Cliente conta) {
        String SemPontos = conta.getCpfCnpj().replaceAll("[.-]", "");
        conta.setCpfCnpj(SemPontos);
        conta.setNome(conta.getNome() + " Louzano ");
        repository.create(conta);
    }

    @Override // adicionar pontos e traços
    public List<Cliente> readAll() {
        for (Cliente cliente : readAll()) {
            String addPontosETracos = adicionarPontosETracos(cliente.getNome());
            cliente.setNome(addPontosETracos);
        }
        return readAll();
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replaceAll(" ", ".").replaceAll("-", ".");
        return nome;
    }

    @Override // procurar o valor para atualizar //atualizar
    public List<Cliente> update(int id, Cliente conta) {
        for (Cliente cliente : Data)
            if (cliente.getId() == id) {
                cliente.setNome(conta.getNome());
                repository.update(id, conta);
            }
        return null;
    }

    @Override
    public void delete(int id) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente : Data) {
            if (cliente.getId() == id) {
                clienteParaRemover = cliente;
                break;
            }
        }
        if (clienteParaRemover != null) {
            Data.remove(clienteParaRemover);
        }
    }
}


// Encontrar o cliente com o ID correspondente na lista.
// procurar o valor para atualizar delele
// Remover o cliente se ele foi encontrado.