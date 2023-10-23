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
        database[indice] = dados;
        indice++;
        this.bubbleSort();
    }

    /**
     * Algoritmo para ordenar um array por cpf
     */
    private void bubbleSort() {
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice - 1; j++) {
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
        int direita = FuncionarioDAOimpl.indice - 1;

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
        boolean funcionarioDeletado = false;
        for (int i = 0; i < indice; i++) {
            if (database[i] != null && database[i].getCpfCnpj().equals(identificacao)) {
                database[i] = null;
                funcionarioDeletado = true;
                break;
            }
        }
        // TODO trocar o funcionario da ultima posição, para a posicao null
        // TODO chamar o método bubbleSort
        bubbleSortNull(); // Chama a função de ordenação após a remoção.
        indice--;
        return funcionarioDeletado;
    }

    private void bubbleSortNull() {
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice - 1; j++) {
                if (database[j] == null && database[j + 1] != null) {
                    // Trocar o funcionário com o próximo na lista
                    aux = database[j];
                    database[j] = database[j + 1];
                    database[j + 1] = aux;
                }
            }
        }
    }
}