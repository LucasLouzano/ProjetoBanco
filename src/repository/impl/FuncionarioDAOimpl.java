package repository.impl;

import model.Cliente;
import model.Funcionario;
import repository.FuncionarioDAO;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOimpl implements FuncionarioDAO {

    private static List<Funcionario> Banco = new ArrayList<>();

    public FuncionarioDAOimpl() {
    }


    public void create(Funcionario Dados) {
        String SemPontos = Dados.getCpfCnpj().replaceAll("[.-]", "");
        Dados.setCpfCnpj(SemPontos);
        Banco.add(Dados);
    }
    public List<Funcionario> readAll() {
        for (Funcionario funcionario : Banco) {
            String cpfcnpjFormatado = adicionarPontosETracos(funcionario.getCpfCnpj());
           funcionario.setCpfCnpj(cpfcnpjFormatado);
        }
        return Banco;
    }
    private String adicionarPontosETracos(String cpfcnpj) {
        cpfcnpj = cpfcnpj.replace(" ", ".");
        return cpfcnpj;
    }


    public boolean update(String identificacao, Funcionario novoFuncionario) {
        for (int i = 0; i < Banco.size(); i++) {
           Funcionario funcionario = Banco.get(i);
            if (funcionario.getCpfCnpj().equals (identificacao)) {
                Banco.set(i, novoFuncionario);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int identificacao) {
        for (Funcionario funcionario : Banco) {
            if (funcionario.getIdentificacao() == identificacao) {
                Banco.remove(funcionario);
                System.out.println("Funcionário removido com sucesso!");

            } else {
                System.out.println("Funcionário com identificação não encontrado.");
            }
        }
        return false;
    }
}


