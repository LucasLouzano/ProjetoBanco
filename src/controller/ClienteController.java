package controller;

import java.util.List;

import model.Cliente;
import Service.impl.ClienteService;
import Service.impl.ClienteServiceImpl;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    public void create(Cliente cliente) {
        String SemPontos = cliente.getCpfCnpj().replaceAll("[.-]", "");
        cliente.setCpfCnpj(SemPontos);
        cliente.setNome(cliente.getNome() + " Louzano ");
        service.create(cliente);
        // remover pontos e traços
    }

    // adicionar pontos e traços
    public List<Cliente> readAll() {
        List<Cliente> clientes = service.readAll();
        for (Cliente cliente : clientes) {
            String addPontosETracos = adicionarPontosETracos(cliente.getNome());
            cliente.setNome(addPontosETracos);
        }
        return clientes;
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replaceAll(" ", ".").replaceAll("-", ".");
        return nome;
    }

    public void update(int id, Cliente cliente) {
        service.update(id, cliente);
    }

    public void delete(int id) {
        service.delete(id);
    }

}
