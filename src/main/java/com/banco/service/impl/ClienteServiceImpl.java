package com.banco.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
import com.banco.model.LoginDTO;
import com.banco.repository.ClienteDAO;

import com.banco.repository.impl.ClienteDAOImpl;
import com.banco.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO repository = new ClienteDAOImpl();
    List<Cliente> clientes = new ArrayList<>();
    private static final String MSG_CLIENTE_VALID = "Cliente com nome inválido.";
    private static final String MSG_LOGIN_VALID = "Cliente com login e senha inválido.";

    @Override // create-criar //remover pontos e traços
    public void create(Cliente cliente) throws CpfCnpjException {
        this.validCliente(cliente);
        String SemPontos = cliente.getCpfCnpj().replaceAll("[.-]", "");
        cliente.setCpfCnpj(SemPontos);
        repository.create(cliente);

    }

    //Opção de listar todas as contas do cpf informado
    private void validCliente(Cliente cliente) throws CpfCnpjException {
        if (cliente.getCpfCnpj().length() < 11) {
            throw new CpfCnpjException();
        } else if (cliente.getNome() == null || cliente.getNome().length() < 4) {
            throw new RuntimeException(MSG_CLIENTE_VALID);
        } else if(cliente.getCpfCnpj() == null && cliente.getSenha() == null){
        	throw new RuntimeException(MSG_LOGIN_VALID);
        }
    }

    @Override
    public List<Cliente> listarClientes(String cpfInformado) {
        if (cpfInformado.length() <= 11) {
            return repository.listarClientes(cpfInformado);
        }
        return null;
    }

    @Override // adicionar pontos e traços
    public List<Cliente> readAll() {
        return repository.readAll();
    }

    @Override // procurar o valor para atualizar //atualizar
    public boolean update(String id, Cliente novoCliente) {
        return repository.update(id, novoCliente);
    }

    @Override // chamar o read, passar o objeto com parametro
    public boolean delete(String id) {
        return repository.delete(id);
    }

    @Override
    public Cliente read(String cpf) {
        return repository.read(cpf);
    }

    @Override
    public Cliente readClientePeloNome(String nome) {
        return repository.readClientePeloNome(nome);
    }

	@Override
	public boolean login(LoginDTO loginDTO) {
		Cliente cliente = repository.readClientePeloEmail(loginDTO.email());
		if(cliente != null) {
			return cliente.getSenha().equals(loginDTO.senha());
		}
		
		return false;
	}
}