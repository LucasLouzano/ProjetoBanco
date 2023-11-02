package service.impl;

import model.Funcionario;
import repository.FuncionarioDAO;
import repository.impl.FuncionarioDAOimpl;
import service.FuncionarioService;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService {
    private FuncionarioDAO repository = new FuncionarioDAOimpl();
    List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void create(Funcionario novoFuncionario) {
        String cpfSemPontos = novoFuncionario.getCpfCnpj()
                        .replaceAll("[.-]", "");
        novoFuncionario.setCpfCnpj(cpfSemPontos);
        boolean validaCpfExistente = funcionarios.stream()
                .anyMatch(f -> f.getCpfCnpj().equals(novoFuncionario.getCpfCnpj()));
        //VALIDAR SE O CPF É DIFERENTE AO CPF DO CLIENTE
        if (validaCpfExistente) {
            //ERRO NA VALIDAÇÃO DO CPF
            System.out.println("CPF/CNPJ já existe. Não é possível cadastrar.");
        } else if (cpfSemPontos.length() != 11) { //VALIDA SE O CPF É DIFERENTE DE 11 DIGITOS
            //ERRO NO TAMANHO DO CPF
            System.out.println("CPF/CNPJ com tamanho inválido. Deve conter pelo menos 11 dígitos.");
        } else {
            //CRIA UM NOVO FUNCIONARIO
            repository.create(novoFuncionario);
        }
    }

    @Override
    public List<Funcionario> readAll() {
        return repository.readAll();
    }

    @Override
    public Funcionario read(String cpf) {
        return repository.read(cpf);

    }

    @Override
    public boolean update(String identificacao, Funcionario dados) {
        return repository.update(identificacao, dados);
    }

    @Override
    public boolean delete(String identificacao) {
        return repository.delete(identificacao);
    }
}