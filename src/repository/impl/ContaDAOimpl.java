package repository.impl;
import model.Conta;
import repository.ContaDAO;
import java.util.ArrayList;
import java.util.List;

public class ContaDAOimpl implements ContaDAO {
    private static List<Conta> DATABASE = new ArrayList<>();

    public ContaDAOimpl() {
    }

    @Override
    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        DATABASE.add(parametro);
    }
    @Override
    public List<Conta> readAll() {
        for (Conta conta : DATABASE) {
            String nomeFormatado = adicionarPontosETracos(conta.getNome());
            conta.setNome(nomeFormatado);
        }
        return DATABASE;
    }
    private String adicionarPontosETracos(String nome) {
        nome = nome.replace(" ", ".");
        return nome;
    }
    @Override
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
    public boolean delete(String nome) {
    Conta contaParaRemover = null;
        for (Conta conta : DATABASE) {
            if (conta.getNome().equals(nome)) {
                contaParaRemover = conta;
                break;
            }
        }
        if (contaParaRemover != null) {
            DATABASE.remove(contaParaRemover);
            return true;
        }
        return false;
    }
}
