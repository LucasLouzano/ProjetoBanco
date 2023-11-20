package com.banco.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.banco.model.Conta;
import com.banco.repository.ContaDAO;

public class ContaDAOimpl implements ContaDAO {
    private static List<Conta> basedata = new ArrayList<>();

    public ContaDAOimpl() {
    }

    @Override
    public void create(Conta conta) {
        basedata.add(conta);
        bubbleSort();
    }

    /**
     * Algoritmo para ordenar um array por cpf
     */
    private void bubbleSort() {
        Conta aux;
        int indice = basedata.size();
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice - 1; j++) {
                if (Long.parseLong(basedata.get(j).getCpfCnpj()) > Long.parseLong(basedata.get(j + 1).getCpfCnpj())) {
                    // Troca os elementos se o primeiro for maior que o segundo
                    aux = basedata.get(j);
                    basedata.set(j, basedata.get(j + 1));
                    basedata.set(j + 1, aux);

                }
            }
        }
    }

    // ReadAll-ler-Tudo
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
    public boolean delete(String cpf) {
        boolean contadelete = false;
        for (int i = 0; i < basedata.size(); i++) {
            if (basedata.get(i) != null && basedata.get(i).getCpfCnpj().equals(cpf)) {
                basedata.remove(i);
                contadelete = true;
                break;
            }
        }
        bubbleSort();
        return contadelete;
    }

    @Override
    public Conta read(String cpf) {
        return binarySearch(cpf);
    }

    private Conta binarySearch(String cpf) {
        int esquerda = 0;
        int direita = basedata.size() - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (basedata.get(meio).getCpfCnpj().equals(cpf)) {
                return basedata.get(meio);
            } else if (Long.parseLong(basedata.get(meio).getCpfCnpj()) < Long.parseLong(cpf)) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return null; // Retorna null se o cliente não for encontrado
    }

}