package com.banco.repository;

import com.banco.model.Conta;


public interface ContaDAO extends GenericCRUD<Conta, String> {
    Conta readContaPeloEmail(String email);

}

