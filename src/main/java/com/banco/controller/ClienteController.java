package com.banco.controller;

import java.util.List;

import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
import com.banco.service.ClienteService;
import com.banco.service.impl.ClienteServiceImpl;

public class ClienteController {

    private ClienteService service = new ClienteServiceImpl();

    public void create(Cliente cliente) throws CpfCnpjException {
        service.create(cliente);
    }
    public List<Cliente> listarClientes(String cpfInformado) {
       return service.listarClientes(cpfInformado);
    }

    public List<Cliente> readAll() {
        return service.readAll();
    }

    public boolean update(String id, Cliente novoCliente) {
        return service.update(id, novoCliente);
    }

    public boolean delete(String id) {
        return service.delete(id);
    }

    public Cliente read(String cpf) {
        return service.read(cpf);
    }

	public Cliente readClientePeloNome(String nome){
		return service.readClientePeloNome(nome);
	}
}
