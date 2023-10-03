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

    @Override   // ReadAll-ler-Tudo
    public Cliente readAll() {
        for (Cliente cliente : baseDados) {
            if (cliente.getId() == cliente.getId()) {
                return cliente;
            }
        }
        return null;
    }



 // procurar o valor para atualizar //atualizar
    public boolean update(int id, Cliente conta) {
        for (Cliente cliente : baseDados)
            if (cliente.getId() == id) {
                cliente.setNome(conta.getNome());
                baseDados.add(id, conta);
                return true;
            }
        return false;
    }

    // delete-excluir
    public boolean delete(int id) {
        Cliente clienteParaRemover = null;
        for (Cliente cliente :baseDados ) {
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



