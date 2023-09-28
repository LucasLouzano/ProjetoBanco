package controller;

import java.util.List;

import model.Cliente;
import Service.impl.ClienteService;
import Service.impl.ClienteServiceImpl;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    public void create(Cliente contas) {
        String SemPontos = contas.getCpfCnpj().replaceAll("[.-]", "");
        contas.setCpfCnpj(SemPontos);
        contas.setNome(contas.getNome() + " Louzano ");
        service.create(contas);
        // remover pontos e traços
    }

    // adicionar pontos e traços
    public List<Cliente> readAll() {
        List<Cliente> Conta = service.readAll();
        for (Cliente contas : Conta) {
            String addPontosETracos = adicionarPontosETracos(contas.getNome());
            contas.setNome(addPontosETracos);
        }
        return Conta;
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replaceAll(" ", ".").replaceAll("-", ".");
        return nome;
    }

    public void update(int id, Cliente Conta) {
        List<Cliente> Contas = service.update(id, Conta);
        Cliente Atualizarconta = null;
        for (Cliente cliente : Contas) {
            if (cliente.getId() == id) {
                Atualizarconta = cliente;
                break;
            }
        }
        if (Atualizarconta != null) {
            Atualizarconta.setId(Conta.getId());

        } else {

        }
    }

    public void delete(int id) {
        service.delete(id);
    }

}