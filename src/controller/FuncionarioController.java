package controller;

import model.Funcionario;
import service.FuncionarioService;
import service.impl.FuncionarioServiceImpl;

import java.util.List;

public class FuncionarioController extends FuncionarioServiceImpl {
    private FuncionarioService service = new FuncionarioServiceImpl();

    public void create(Funcionario dados) {
        service.create(dados);
    }

    public List<Funcionario> readAll() {
        return service.readAll();
    }

    public Funcionario read() {
        return service.read();
    }

    public boolean update(String identificacao, Funcionario dados) {
        return service.update(identificacao, dados);
    }

    public boolean delete(String identificacao) {
        return service.delete(identificacao);
    }
}
