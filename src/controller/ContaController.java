package controller;

import service.ContaService;
import service.impl.ContaServiceimpl;
import model.Conta;

import java.util.List;


public class ContaController {
    private ContaService service = new ContaServiceimpl();

    public void create(Conta parametro) {
        service.create(parametro);
    }

    public List<Conta> readAll() {
        return service.readAll();
    }

    public boolean update(String nome, Conta parametro) {
        return service.update(nome, parametro);
    }

    public boolean delete(String cpf){
      return service.delete(cpf);

    }

    public Conta read(String cpf) {
        return service.read(cpf);
    }
}
