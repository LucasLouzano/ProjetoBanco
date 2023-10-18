package repository.impl;

import repository.ClienteDAO;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAOImpl implements ClienteDAO {
    private static List<Cliente> basedados = new ArrayList<>();


    public ClienteDAOImpl() {
    }

    // create-criar // remover pontos e traços
    public void create(Cliente conta) {
        basedados.add(conta);
        bubbleSort(basedados);
    }

    /**
     * Algoritmo para ordenar um array por cpf
     */
    private void bubbleSort(List<Cliente>lista) {
        int indice = lista.size();
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice - 1; j++) {
                if (Long.parseLong(basedados.get(j).getCpfCnpj()) > Long.parseLong( basedados.get( j + 1).getCpfCnpj())) {
                    // Troca os elementos se o primeiro for maior que o segundo
                    Cliente aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set( j + 1, aux);

                }
            }
        }
    }

    // ReadAll-ler-Tudo
    public List<Cliente> readAll() {
        List<Cliente> clientesMaioresDe60 = new ArrayList<>();
        for (Cliente cliente : basedados) {
            if (cliente.getIdade() > 60) {
                clientesMaioresDe60.add(cliente);
            }
        }
        return clientesMaioresDe60;
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
        Cliente clienteParaRemover = null;
        for (Cliente cliente : basedados) {
            if (cliente.getCpfCnpj().equals(id)) {
                clienteParaRemover = cliente;
                break;
            }
        }
        if (clienteParaRemover != null) {
            basedados.remove(clienteParaRemover);
            return true;
        }
        return false;
    }

    @Override
    public Cliente read(String cpf) {
        return binarySearch(basedados,cpf);
    }
        private Cliente binarySearch(List<Cliente> lista, String cpf) {
            int esquerda = 0;
            int direita = lista.size() - 1;

            while (esquerda <= direita) {
                int meio = (esquerda + direita) / 2;

                if (lista.get(meio).getCpfCnpj().equals(cpf)) {
                    return lista.get(meio);
                } else if (Long.parseLong(lista.get(meio).getCpfCnpj()) < Long.parseLong(cpf)) {
                    esquerda = meio + 1;
                } else {
                    direita = meio - 1;
                }
            }
            return null;  // Retorna null se o cliente não for encontrado
        }

        // TODO Auto-generated method stub
     //   throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
//}
