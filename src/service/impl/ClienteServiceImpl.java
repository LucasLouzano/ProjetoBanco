package Service.impl;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteServiceImpl implements ClienteService {
    private List<Cliente> Data = new ArrayList<>();

    @Override
    public void create(Cliente conta) {
        String SemPontos = conta.getCpfCnpj().replaceAll("[.-]", "");
        conta.setCpfCnpj(SemPontos);
        conta.setNome(conta.getNome() + " Louzano ");
        Data.add(conta);
        // remover pontos e traços
    }

    // adicionar pontos e traços
    @Override
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


    // procurar o valor para atualizar //atualizar

    @Override
    public List<Cliente> update(int id, Cliente conta) {
        for (Cliente cliente : Data) {
            if (cliente.getId() == id) {
                cliente.setNome(conta.getNome());
                Data.add(id, conta);
            }
        }
        return null;
    }


    // Encontrar o cliente com o ID correspondente na lista.
    @Override
    public void delete(int id) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente : Data) {
            if (cliente.getId() == id) {
                clienteParaRemover = cliente;// procurar o valor para atualizar delele
                break;
            }
        }
        // Remover o cliente se ele foi encontrado.
        if (clienteParaRemover != null) {
            Data.remove(clienteParaRemover);

        }
    }
}
