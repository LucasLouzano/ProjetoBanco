package controller;

import model.Funcionario;
import service.FuncionarioService;
import service.impl.FuncionarioServiceImpl;

import java.util.List;

public class FuncionarioController {
    private FuncionarioService service = new FuncionarioServiceImpl();

    public void create(Funcionario Dados) {
        service.create(Dados);
    }

    public List<Funcionario> readAll() {
        return service.readAll();
    }

    public boolean update(String identificacao, Funcionario Dados) {
        return service.update(identificacao, Dados);
    }

    public boolean delete(String identificacao) {
        return service.delete(identificacao);
    }
}
