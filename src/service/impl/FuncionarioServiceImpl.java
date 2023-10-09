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
    public void create(Funcionario Dados) {
        repository.create(Dados);
    }
    @Override
    public List<Funcionario> readAll() {
       return funcionarios;
    }
    @Override
    public boolean update(String identificacao, Funcionario Dados) {
        return repository.update(identificacao,Dados);
    }
    @Override
    public boolean delete(int identificacao) {
        return repository.delete(identificacao);
    }
}