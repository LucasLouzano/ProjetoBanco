package Controller;

import Cliente.Clientes;
import Repository.ClientesRepository;

import java.util.ArrayList;
import java.util.List;

public class ClienteCRUD implements ClientesRepository {

    private static List<Clientes> clientes;

    public ClienteCRUD() {
        clientes = new ArrayList<>();
    }

    //create-criar
    public void create(Clientes contas) {
        clientes.add(contas);
    }
    //ReadAll-ler-Tudo
    public List<Clientes> readAll() {
        return clientes;
    }
    //update-atualizar
    @Override
    public void update(int id, Clientes contas) {

    }
    //delete-excluir
    @Override
    public void Delete(int id) {

    }
}
