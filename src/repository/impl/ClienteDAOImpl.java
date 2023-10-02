package repository.impl;

import repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

    private static List<Cliente> baseDados = new ArrayList<>();

    public ClienteDAOImpl() {
    }

    // create-criar
    public void create(Cliente conta) {
        String SemPontos = conta.getCpfCnpj().replaceAll("[.-]", "");
        conta.setCpfCnpj(SemPontos);
        conta.setNome(conta.getNome() + " Louzano ");
        baseDados.add(conta);
        // remover pontos e traços
    }

    // ReadAll-ler-Tudo
    public List<Cliente> readAll() {
        for (Cliente cliente : baseDados) {
            String addPontosETracos = adicionarPontosETracos(cliente.getNome());
            cliente.setNome(addPontosETracos);
        }
        return baseDados;
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replaceAll(" ", ".").replaceAll("-", ".");
        return nome;
    }

    // procurar o valor para atualizar //atualizar
    @Override
    public List<Cliente> update(int id, Cliente conta) {
        for (Cliente cliente : baseDados) {
            if (cliente.getId() == id) {
                cliente.setNome(conta.getNome());
                baseDados.add(id, conta);
            }
        }
        return null;
    }


    // delete-excluir
    @Override
    public void delete(int id) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente : baseDados) {
            if (cliente.getId() == id) {
                clienteParaRemover = cliente;   // procurar o valor para atualizar delele
                cliente.setId(cliente.getId());
            }
        }
        if (clienteParaRemover != null) {
            baseDados.remove(clienteParaRemover);
        }
    }
}

