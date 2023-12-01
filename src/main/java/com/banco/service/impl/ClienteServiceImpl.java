package com.banco.service.impl;
import java.util.ArrayList;
import java.util.List;

import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
import com.banco.repository.ClienteDAO;

import com.banco.repository.impl.ClienteDAOImpl;
import com.banco.service.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO repository = new ClienteDAOImpl();
    List<Cliente> clientes = new ArrayList<>();
    private static final String MSG_CLIENTE_VALID = "Cliente com nome inválido.";

    @Override // create-criar //remover pontos e traços
    public void create(Cliente cliente) throws CpfCnpjException {
    	this.validCliente(cliente);
        String SemPontos = cliente.getCpfCnpj().replaceAll("[.-]", "");
        cliente.setCpfCnpj(SemPontos);
        repository.create(cliente);

    }
    
    private void validCliente(Cliente cliente) throws CpfCnpjException {
    	if(cliente.getCpfCnpj().length() < 11) {
    		throw new CpfCnpjException();
    	}else if(cliente.getNome() == null || cliente.getNome().length() < 4 ) {
    		throw new RuntimeException(MSG_CLIENTE_VALID);
    	}
    }

    @Override // adicionar pontos e traços
    public List<Cliente> readAll() {
        return repository.readAll();

    }

    @Override // procurar o valor para atualizar //atualizar
    public boolean update(String id, Cliente conta) {
        return repository.update(id, conta);
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

}
