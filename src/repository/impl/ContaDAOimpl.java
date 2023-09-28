package repository.impl;

import model.Conta;
import java.util.ArrayList;
import java.util.List;

public class ContaDAOimpl implements ContaDAO {
    private static List<Conta> DATABASE = new ArrayList<>();

    public ContaDAOimpl() {
    }

    // create-criar  database
    public void create(Conta parametro) {
        DATABASE.add(parametro);

    }

    //ReadAll-ler-Tudo
    public List<Conta> readAll() {
        return DATABASE;
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

