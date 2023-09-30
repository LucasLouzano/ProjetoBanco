package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import service.impl.ClienteService;
import service.impl.ClienteServiceImpl;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    private List<Cliente> clientes;

    public void create(Cliente conta) {
        String SemPontos = conta.getCpfCnpj().replaceAll("[.-]", "");
        conta.setCpfCnpj(SemPontos);
        conta.setNome(conta.getNome() + " Louzano ");
        service.create(conta);
        // remover pontos e traços
    }

    // adicionar pontos e traços
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

    public List<Cliente> update(int id, Cliente conta) {
        List<Cliente> Clientes = service.update(id, conta);
        for (Cliente cliente : Clientes) { // procurar o valor para atualizar //atualizar
            if (cliente.getId() == id) {
                cliente.setNome(conta.getNome());
            }
        }
        return Clientes;
    }

    // Encontrar o cliente com o ID correspondente na lista.
    public void delete(int id) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clienteParaRemover = cliente;// procurar o valor para atualizar delele
                break;
            }
        }
        // Remover o cliente se ele foi encontrado.
        if (clienteParaRemover != null) {
            clientes.remove(clienteParaRemover);

        }
    }
}
