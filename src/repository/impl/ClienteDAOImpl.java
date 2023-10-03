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
    }

    @Override // ReadAll-ler-Tudo
    public List<Cliente> readAll() {
        return baseDados;
    }

    // procurar o valor para atualizar //atualizar
    @Override
    public boolean update(String id, Cliente novoCliente) {
        for (int i = 0; i < baseDados.size(); i++) {
            Cliente cliente = baseDados.get(i);
            if (cliente.getCpfCnpj().equals(id)) {
                baseDados.set(i, novoCliente);
                return true;
            }
        }
        return false;
    }

    // delete-excluir
    public boolean delete(int id) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente : baseDados) {
            if (cliente.getId() == id) {
                clienteParaRemover = cliente;
                break;
            }
        }
        if (clienteParaRemover != null) {
            baseDados.remove(clienteParaRemover);
            return true;
        }
        return false;
    }
}
