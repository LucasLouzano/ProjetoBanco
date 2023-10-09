package repository.impl;

import model.Cliente;
import model.Conta;
import repository.ContaDAO;

import javax.print.attribute.standard.PageRanges;
import java.util.ArrayList;
import java.util.List;

public class ContaDAOimpl implements ContaDAO {
    private static List<Conta> DATABASE = new ArrayList<>();

    public ContaDAOimpl() {
    }

    // create-criar  database
    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        DATABASE.add(parametro);
    }
    //ReadAll-ler-Tudo
    @Override
    public List<Conta> readAll() {
        for (Conta cliente : DATABASE) {
            String nomeFormatado = adicionarPontosETracos(cliente.getNome());
            cliente.setNome(nomeFormatado);
        }
        return DATABASE;
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replace(" ", ".");
        return nome;
    }

    @Override
    // update-atualizar  // procurar valor para atualizar, atualizar
    public boolean update(String nome, Conta novaConta) {
        for (int i = 0; i < DATABASE.size(); i++) {
            Conta conta = DATABASE.get(i);
            if (conta.getCpfCnpj().equals(nome)) {
                DATABASE.set(i, novaConta);
                return true;
            }
        }
        return false;
    }

    @Override
    // delete-excluir, procurar valor para atualizar delete
    public boolean delete(String nome) {
        Conta contaParaRemover = null;
        for (Conta conta : DATABASE) {
            if (conta.getNome().equals(nome)) {
                DATABASE.remove(conta);
                break;
            }
        }
        if (contaParaRemover != null) {
            DATABASE.remove(contaParaRemover);
        }
        return false;
    }
}

