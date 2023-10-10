package repository.impl;

import model.Funcionario;
import repository.FuncionarioDAO;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOimpl implements FuncionarioDAO {

    private static Funcionario[] database = new Funcionario[20];
    private static int indice = 0;

    public FuncionarioDAOimpl() {
    }

    public void create(Funcionario funcionario) {
        String cpfSemPontos = funcionario.getCpfCnpj().replaceAll("[.-]", "");
        funcionario.setCpfCnpj(cpfSemPontos);
        database[this.indice] = funcionario;
        indice++;
        // TODO
        // aplicar o buble sort no database (ordenar por cpf)
    }

    public List<Funcionario> readAll() {
        // converter database para um ArrayList
        return null;
    }

    private String adicionarPontosETracos(String cpfcnpj) {
        cpfcnpj = cpfcnpj.replace(" ", ".");
        return cpfcnpj;
    }

    public boolean update(String identificacao, Funcionario novoFuncionario) {
        for (int i = 0; i < this.indice; i++) {
            Funcionario funcionario = database[i];
            // TODO
            /*
             * if (funcionario.getCpfCnpj().equals(identificacao)) {
             * database.set(i, novoFuncionario);
             * return true;
             * }
             */
        }
        return false;
    }

    public boolean delete(String identificacao) {
        Funcionario funcionarioParaRemover = null;
        for (Funcionario funcionario : database) {
            if (funcionario.getCpfCnpj().equals(identificacao)) {
                funcionarioParaRemover = funcionario; // Define a funcionarioParaRemover quando encontramos uma
                                                      // correspondência.
                break;
            }
        }
        // TODO
        /*
         * if (funcionarioParaRemover != null) {
         * database.remove(funcionarioParaRemover); // Remove o funcionario encontrado.
         * return true; // Retorna true para indicar que a funcionario foi removido com
         * sucesso.
         * }
         */
        return false; // Retorna false se nenhum funcionario com identificação especificado foi
                      // encontrado.
    }

    @Override
    public Funcionario read() {
        // TODO implementar o binary search
        return null;
    }
}
