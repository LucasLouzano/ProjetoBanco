package com.banco.service.impl;

import java.util.List;

import com.banco.model.Conta;
import com.banco.repository.ContaDAO;
import com.banco.repository.impl.ContaDAOimpl;
import com.banco.service.ContaService;

public class ContaServiceimpl implements ContaService {
    private ContaDAO repository = new ContaDAOimpl();


    @Override
    public void create(Conta nome) {
        if (nome.getCpfCnpj().length() < 11 && nome.getCpfCnpj() != null) {
            this.validConta(nome);
            String SemPontos = nome.getCpfCnpj().replaceAll("[.-]", "");
            nome.setCpfCnpj(SemPontos);
            repository.create(nome);
        }
    }

    private void validConta(Conta nome) {
        if (nome.getCpfCnpj().length() < 11) {
        } else if (nome.getNome() == null || nome.getNome().length() < 4) {

        }
    }
    
    @Override
    public List<Conta> readAll() {
        return repository.readAll();
    }

    @Override
    public List<Conta> listarContasPorCpf(String cpfInformado) {
    	if(cpfInformado != null && cpfInformado.length() == 11) {
	        List<Conta> ContasPorCpf = repository.readAll();
	        for (Conta contas : ContasPorCpf) {
	            if (contas.getCpfCnpj().equals(cpfInformado)) {
	                ContasPorCpf.add(contas);
	            }
	        }
	        return ContasPorCpf;
    	}
    	return null;
    }
    
    @Override
    public boolean update(String nome, Conta conta) {
        return repository.update(nome, conta);
    }

    @Override
    public boolean delete(String cpf) {
        return repository.delete(cpf);
    }

    @Override
    public Conta read(String cpf) {
        return repository.read(cpf);
    }

    @Override
    public Conta readContaPeloNome(String nome) {
        return repository.readContaPeloNome(nome);
    }

}
