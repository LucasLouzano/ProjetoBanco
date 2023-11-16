package com.banco.repository;

import com.banco.model.Cliente;

public interface ClienteDAO extends GenericCRUD<Cliente, String> {

	Cliente readClientePeloNome(String nome);

}
