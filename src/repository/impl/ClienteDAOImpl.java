package repository.impl;

import repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

    private static List<Cliente> baseDados = new ArrayList<>();;

    public ClienteDAOImpl() {
    }

    // create-criar
    public void create(Cliente contas) {
        baseDados.add(contas);
    }

    // ReadAll-ler-Tudo
    public List<Cliente> readAll() {
        return baseDados;
    }

    // update-atualizar
    @Override
    public void update(int id, Cliente contas) {
        // procurar o valor para atualizar
        // atualizar
    }

    // delete-excluir
    @Override
    public void delete(int id) {
        // procurar o valor para atualizar
        // delete
    }

}
