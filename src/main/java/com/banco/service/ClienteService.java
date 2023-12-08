package com.banco.service;

import java.util.List;

import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
import com.banco.model.LoginDTO;

public interface ClienteService {

    void create(Cliente cliente) throws CpfCnpjException;

    List<Cliente> readAll();

    boolean update(String id, Cliente novoCliente);

    boolean delete(String id);

    Cliente read(String cpf);

	Cliente readClientePeloNome(String nome);
    List<Cliente> listarClientes(String cpfInformado);
    
    boolean login(LoginDTO loginDTO);

}
