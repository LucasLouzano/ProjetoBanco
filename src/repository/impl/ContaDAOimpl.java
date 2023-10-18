package repository.impl;

import model.Cliente;
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
        basedata.add(parametro);
        bubbleSort(basedata);
    }
    /**
     * Algoritmo para ordenar um array por cpf
     */
    private void bubbleSort(List<Conta> lista) {
        int indice = lista.size();
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice - 1; j++) {
                if (Long.parseLong(basedata.get(j).getCpfCnpj()) > Long.parseLong(basedata.get(j + 1).getCpfCnpj())) {
                    // Troca os elementos se o primeiro for maior que o segundo
                    Conta aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);

                }
            }
        }
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
        return binarySearch(basedata,numeroConta);
    }
    private Conta binarySearch(List<Conta> lista, String numeroConta) {
        int esquerda = 0;
        int direita = lista.size() - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (lista.get(meio).getCpfCnpj().equals(numeroConta)) {
                return lista.get(meio);
            } else if (Long.parseLong(lista.get(meio).getCpfCnpj()) < Long.parseLong(numeroConta)) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return null;  // Retorna null se o cliente não for encontrado
    }

    // TODO Auto-generated method stub
      //throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

