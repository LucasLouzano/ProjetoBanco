package service.impl;

import model.Funcionario;
import repository.FuncionarioDAO;
import repository.impl.FuncionarioDAOimpl;
import service.FuncionarioService;

import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService {
    private FuncionarioDAO repository = new FuncionarioDAOimpl();

    @Override
    public void create(Funcionario dados) {
        String cpfSemPontos = dados.getCpfCnpj().replaceAll("[.-]", "");
        dados.setCpfCnpj(cpfSemPontos);
        repository.create(dados);

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