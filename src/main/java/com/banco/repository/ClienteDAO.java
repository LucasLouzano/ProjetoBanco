package com.banco.repository;
import com.banco.model.Cliente;

import java.util.List;

public interface ClienteDAO extends GenericCRUD<Cliente, String> {

    Cliente readClientePeloNome(String nome);
    List<Cliente> listarClientes(String cpfInformado);

}

