package repository.impl;

import repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;


public class ClienteDAOImpl implements ClienteDAO {
    private static List<Cliente> baseDados = new ArrayList<>();

    public ClienteDAOImpl() {
    }

    // create-criar // remover pontos e traços
    public void create(Cliente conta) {
        String SemPontos = conta.getCpfCnpj().replaceAll("[.-]", "");
        conta.setCpfCnpj(SemPontos);
        baseDados.add(conta);
    }

    // ReadAll-ler-Tudo
    public List<Cliente> readAll() {
        for (Cliente cliente : baseDados) {
            String cpfcnpjFormatado = adicionarPontosETracos(cliente.getCpfCnpj());
            cliente.setCpfCnpj(cpfcnpjFormatado);
        }
        return baseDados;
    }
    private String adicionarPontosETracos(String cpfcnpj) {
        cpfcnpj = cpfcnpj.replace(" ", ".");
        return cpfcnpj;
    }

    // procurar o valor para atualizar //atualizar
    public boolean update(String id, Cliente novoCliente) {
        for (int i = 0; i < baseDados.size(); i++) {
            Cliente cliente = baseDados.get(i);
            if (cliente.getCpfCnpj().equals(id)) {
                baseDados.set(i, novoCliente);
                return true;
            }
        }
        return false;
    }

    // delete-excluir
    public boolean delete(int id) {
        for (Cliente cliente : baseDados) {
            if (cliente.getId() == id) {
                baseDados.remove(cliente);
                break;
            }
        }
        return false;
    }
}
