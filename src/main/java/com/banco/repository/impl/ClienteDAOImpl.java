package com.banco.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.banco.model.Cliente;
import com.banco.repository.ClienteDAO;

public class ClienteDAOImpl implements ClienteDAO {
    private static List<Cliente> basedados = new ArrayList<>();
    private Cliente aux;

    public ClienteDAOImpl() {
    }

    public void create(Cliente cliente) {
        basedados.add(cliente);
        bubbleSort();
    }
    @Override
    public List<Cliente> listarClientes(String cpfInformado) {
        List<Cliente> clientesCpf = basedados.stream()
                .filter(c -> c.getCpfCnpj().equals(cpfInformado))
                .collect(Collectors.toList());
        return clientesCpf;
    }

    /**
     * Algoritmo para ordenar um array por cpf
     */
    private void bubbleSort() {
        int indice = basedados.size();
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice - 1; j++) {
                if (Long.parseLong(basedados.get(j).getCpfCnpj()) > Long.parseLong(basedados.get(j + 1).getCpfCnpj())) {
                    // Troca os elementos se o primeiro for maior que o segundo
                    aux = basedados.get(j);
                    basedados.set(j, basedados.get(j + 1));
                    basedados.set(j + 1, aux);
                }
            }
        }
    }

    // ReadAll-ler-Tudo
    @Override
    public List<Cliente> readAll() {
        List<Cliente> clientes = new ArrayList<>();
        for (Cliente cliente : basedados)
            if (cliente != null) {
                clientes.add(cliente);
            }
        return clientes;
    }

    // procurar o valor para atualizar //atualizar
    @Override
    public boolean update(String id, Cliente novoCliente) {
        for (int i = 0; i < basedados.size(); i++) {
            Cliente cliente = basedados.get(i);
            if (cliente.getCpfCnpj().equals(id)) {
                basedados.set(i, novoCliente);
                return true;
            }
        }
        return false;
    }

    // delete-excluir
    public boolean delete(String id) {
        boolean clienteDeletado = false;
        for (int i = 0; i < basedados.size(); i++) {
            if (basedados.get(i) != null && basedados.get(i).getCpfCnpj().equals(id)) {
                basedados.set(i, null);  // Remove o funcionário da lista.
                clienteDeletado = true;
                break; // Indica que a remoção foi bem-sucedida.
            }
        }
        bubbleSortNull();
        return clienteDeletado;
    }

    private void bubbleSortNull() {
        for (int i = 0; i < basedados.size(); i++) {
            for (int j = 0; j < basedados.size() - 1; j++) {
                if (basedados.get(j) == null && basedados.get(j + 1) != null) {
                    // Trocar o cliente  com o próximo na lista
                    aux = basedados.get(j);
                    basedados.set(j, basedados.get(j + 1));
                    basedados.set(j + 1, aux);
                }
            }
        }
    }

    @Override
    public Cliente read(String cpf) {
        return binarySearch(cpf);
    }

    private Cliente binarySearch(String cpf) {
        int esquerda = 0;
        int direita = basedados.size() - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (basedados.get(meio).getCpfCnpj().equals(cpf)) {
                return basedados.get(meio);
            } else if (Long.parseLong(basedados.get(meio).getCpfCnpj()) < Long.parseLong(cpf)) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return null;  // Retorna null se o cliente não for encontrado
    }

    @Override
    public Cliente readClientePeloNome(String nome) {
        List<Cliente> c = basedados
                .stream().filter(cli -> cli.getNome().equals(nome)).collect(Collectors.toList());
        if (c != null) {
            return c.get(0);
        }
        return null;
    }
}
