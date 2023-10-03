package service.impl;

import model.Cliente;
import model.Conta;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;
import repository.impl.ContaDAO;
import repository.impl.ContaDAOimpl;

import java.util.ArrayList;
import java.util.List;

public class ContaServiceimpl implements ContaService {
    List<Conta> contas = new ArrayList<>();
    private ContaDAO repository = new ContaDAOimpl();

    @Override
    public void create(Conta parametro) {
        parametro.setNome(parametro.getNome() + " Louzano ");
        parametro.setEmail(parametro.getEmail() + "Louzano@gmail.com");
        parametro.setSenha(parametro.getSenha() + "12358");
        repository.create(parametro);
    }

    @Override
    public List<Conta> readAll() {
        for (Conta parametro : contas) {
            String addPontosETracos = adicionarPontosETracos(parametro.getNome());
            parametro.setNome(addPontosETracos);
        }
        return contas;
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replaceAll(" ", ".").replaceAll("-", ".");
        return nome;
    }

    @Override
    public void update(String nome, Conta parametro) {
        repository.update(nome, parametro);
    }

    @Override
    public void delete(String nome) {
        repository.delete(nome);

    }
}
