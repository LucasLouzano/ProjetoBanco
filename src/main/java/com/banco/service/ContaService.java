package com.banco.service;

import java.util.List;

import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Conta;

public interface ContaService {

    void create(Conta nome) throws Exception;

    List<Conta> readAll();

    boolean update(String nome, Conta conta);

    boolean delete(String cpf);

    Conta read(String cpf);

    Conta readContaPeloEmail(String email);
    
    List<Conta> listarContasPorCpf(String cpfInformado);


}
