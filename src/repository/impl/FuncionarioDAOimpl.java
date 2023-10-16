package repository.impl;
import model.Funcionario;
import repository.FuncionarioDAO;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOimpl implements FuncionarioDAO {

    private static Funcionario[] database = new Funcionario[20];
    private static int indice = 0;
    private Funcionario aux;
    // TODO
    // aplicar o bubble sort no database (ordenar por cpf)
    @Override
    public void create(Funcionario dados) {
        String cpfSemPontos = dados.getCpfCnpj().replaceAll("[.-]", "");
        dados.setCpfCnpj(cpfSemPontos);
        database[indice] = dados;
        indice++;
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice - 1; j++) {
                if (Integer.parseInt(database[j].getCpfCnpj()) > Integer.parseInt(database[j + 1].getCpfCnpj())) {
                    aux = database[j];
                    database[j] = database[j + 1];
                    database[j + 1] = aux;

                }
            }
        }
    }
    @Override
    public List<Funcionario> readAll() {
        List<Funcionario> funcionarios = new ArrayList<>();
        for (Funcionario funcionario : database)
            if (funcionario != null) {
                funcionarios.add(funcionario);
            }
        return funcionarios;
    }

    @Override
    public Funcionario read() {
        // TODO implementar o binary search busca binaria
        return null;
    }

    @Override
    public boolean update(String identificacao, Funcionario novoFuncionario) {
        for (int i = 0; i < indice; i++) {
            Funcionario funcionario = database[i];
            if (funcionario.getCpfCnpj().equals(identificacao)) {
                database[i] = novoFuncionario;
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean delete(String identificacao) {
        for (int i = 0; i < indice; i++) {
            if (database[i].getCpfCnpj().equals(identificacao)) {
                database[i].setCpfCnpj(null); // Define o CPFCNPJ como null para indicar a remoção.
                return true; // Indica que a remoção foi bem-sucedida.

            }
        }
        return false; // Retorna false se nenhum funcionario com identificação especificado foi encontrado.
    }
}