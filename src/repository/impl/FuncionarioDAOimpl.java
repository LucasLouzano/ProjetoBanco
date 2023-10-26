package repository.impl;

import model.Funcionario;
import repository.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOimpl implements FuncionarioDAO {
    private static Funcionario[] database = new Funcionario[20];
    private static int tamanho = 0;

    @Override
    public void create(Funcionario dados) {
        database[tamanho] = dados;
        tamanho++;
        this.bubbleSort();
    }

    /**
     * Algoritmo para ordenar um array por cpf
     */
    private void bubbleSort() {
        Funcionario aux;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if (Long.parseLong(database[j].getCpfCnpj()) > Long.parseLong(database[j + 1].getCpfCnpj())) {
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
    public Funcionario read(String cpf) {
        return binarySearch(cpf);
    }

    private Funcionario binarySearch(String cpf) {
        int esquerda = 0;
        int direita = FuncionarioDAOimpl.tamanho - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (FuncionarioDAOimpl.database[meio].getCpfCnpj().equals(cpf)) {
                return FuncionarioDAOimpl.database[meio];
            } else if (Long.parseLong(FuncionarioDAOimpl.database[meio].getCpfCnpj()) < Long.parseLong(cpf)) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return null;
    }

    @Override
    public boolean update(String identificacao, Funcionario novoFuncionario) {
        for (int i = 0; i < tamanho; i++) {
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
        boolean funcionarioDeletado = false;
        for (int i = 0; i < tamanho; i++) {
            if (database[i] != null && database[i].getCpfCnpj().equals(identificacao)) {
                database[i] = null;
                funcionarioDeletado = true;
                int indiceExcluido = i;
                // trocar o funcionario da ultima posição, para a posicao null
                database[indiceExcluido] = database[tamanho - 1];
                // null na ultima posicao
                database[tamanho - 1] = null;
                break;
            }
        }
        tamanho--;
        // chamar o método bubbleSort
        this.bubbleSort();
        return funcionarioDeletado;
    }
}