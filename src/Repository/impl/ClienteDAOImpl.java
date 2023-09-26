package Repository.impl;

import Repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

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

    }

    // delete-excluir
    @Override
    public void Delete(int id) {

    }
}
