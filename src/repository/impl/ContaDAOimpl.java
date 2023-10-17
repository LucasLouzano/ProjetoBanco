package repository.impl;

import model.Conta;
import repository.ContaDAO;
import java.util.ArrayList;
import java.util.List;

public class ContaDAOimpl implements ContaDAO {
    private static List<Conta> basedata = new ArrayList<>();

    public ContaDAOimpl() {
    }

    @Override
    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        basedata.add(parametro);
    }

    @Override
    public List<Conta> readAll() {
        List<Conta> contas = new ArrayList<>();
        for (Conta conta : basedata)
            if (conta != null) {
                contas.add(conta);
            }
        return contas;
    }

    @Override
    public boolean update(String nome, Conta novaConta) {
        for (int i = 0; i < basedata.size(); i++) {
            Conta conta = basedata.get(i);
            if (conta.getCpfCnpj().equals(nome)) {
                basedata.set(i, novaConta);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String nome) {
        Conta contaParaRemover = null;
        for (Conta conta : basedata) {
            if (conta.getNome().equals(nome)) {
                contaParaRemover = conta;
                break;
            }
        }
        if (contaParaRemover != null) {
            basedata.remove(contaParaRemover);
            return true;
        }
        return false;
    }

    @Override
    public Conta read(String numeroConta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
}
