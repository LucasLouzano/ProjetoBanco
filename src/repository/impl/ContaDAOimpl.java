package repository.impl;

import model.Cliente;
import model.Conta;
import java.util.ArrayList;
import java.util.List;

public class ContaDAOimpl implements ContaDAO {
    private static List<Conta> DATABASE = new ArrayList<>();

    public ContaDAOimpl() {
    }

    // create-criar  database
    public void create(Conta parametro) {
        parametro.setNome(parametro.getNome() + " Louzano ");
        parametro.setEmail(parametro.getEmail() + "Louzano@gmail.com");
        DATABASE.add(parametro);

    }
    //ReadAll-ler-Tudo
    @Override
    public Cliente readAll() {
        return null;
    }
    @Override
    // update-atualizar
    public void update(String nome, Conta parametro) {
        // procurar o valor para atualizar
        // atualizar

    }

    @Override
    // delete-excluir
    public void delete(String nome) {
        // procurar o valor para atualizar
        // delete
    }

}

