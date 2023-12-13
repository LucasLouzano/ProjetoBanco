package com.banco.service.impl;

import java.util.List;

import com.banco.model.Conta;
import com.banco.repository.ContaDAO;
import com.banco.repository.impl.ContaDAOimpl;
import com.banco.service.ClienteService;
import com.banco.service.ContaService;

public class ContaServiceimpl implements ContaService {
    private ContaDAO repository = new ContaDAOimpl();
    private ClienteService clienteService = new ClienteServiceImpl();
    private static final String MSG_CONTA_VALID = " Número da agencia com 4 caracteres.";
    private static final String VALID_NUMERO_CONTA = " A validação foi bem sucedida.";

    @Override
    public void create(Conta conta) throws Exception {
        if (this.validConta(conta)) {
            String SemPontos = conta.getCpfCnpj().replaceAll("[.-]", "");
            conta.setCpfCnpj(SemPontos);
            if (clienteService.read(conta.getCpfCnpj()) != null) {
                repository.create(conta);
            } else {
                System.out.println("Este cpf não existe! " + conta.getCpfCnpj());
            }
        } else {
            System.out.println("Não foi possível cadastrar a conta : " + conta.getNumeroConta());
        }
    }

    private boolean validConta(Conta conta) throws Exception {
        if (conta.getNumeroConta().length() < 5) {
            throw new Exception(VALID_NUMERO_CONTA);
        } else if (conta.getAgencia().length() < 4) {
            throw new Exception(MSG_CONTA_VALID);
        } else if (conta.getCpfCnpj() == null || conta.getCpfCnpj().length() < 11) {
            return false;
        }

        return true;
    }


    @Override
    public List<Conta> readAll() {
        return repository.readAll();
    }

    @Override
    public List<Conta> listarContasPorCpf(String cpfInformado) {
        if (cpfInformado != null && cpfInformado.length() == 11) {
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
