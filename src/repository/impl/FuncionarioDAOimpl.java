package repository.impl;

import model.Cliente;
import model.Funcionario;
import repository.FuncionarioDAO;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOimpl implements FuncionarioDAO {

    private static Funcionario[] database = new Funcionario[20];
    private static int indice = 0;
    private Funcionario aux;

    public FuncionarioDAOimpl() {
    }
    // TODO
    // aplicar o buble sort no database (ordenar por cpf)

    public void create(Funcionario funcionario) {
        String cpfSemPontos = funcionario.getCpfCnpj().replaceAll("[.-]", "");
        funcionario.setCpfCnpj(cpfSemPontos);
        database[indice] = funcionario;
        indice++;
        for (int i = 0; i < indice ; i++) {
            for (int j = 0; j < indice - 1; j++) {
                if (Integer.parseInt(database[j].getCpfCnpj()) > Integer.parseInt(database[j + 1].getCpfCnpj())) {
                    aux = database[j];
                    database[j] = database[j + 1];
                    database[j + 1] = aux;
                }
            }
        }
    }
    // converter database para um ArrayList
    public List<Funcionario> readAll() {
        List<Funcionario> funcionarios = new ArrayList<>();
        for (Funcionario funcionario : database)
            if (funcionario != null) {
                funcionarios.add(funcionario);
            }
        return funcionarios;
    }

    public boolean update(String identificacao, Funcionario novoFuncionario) {
        for (int i = 0; i < this.indice; i++) {
            Funcionario funcionario = database[i];
                if (funcionario.getCpfCnpj().equals(identificacao)) {
                    database[i] = novoFuncionario;
                    return true;
                }
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
