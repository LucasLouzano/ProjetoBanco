package com.banco.service;

import java.util.List;

import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;

public interface ClienteService {

    void create(Cliente cliente) throws CpfCnpjException;

    List<Cliente> readAll();

    boolean update(String id, Cliente conta);

    boolean delete(String id);

    Cliente read(String cpf);

	Cliente readClientePeloNome(String nome);

}
