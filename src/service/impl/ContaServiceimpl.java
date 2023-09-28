package Service.impl;

import model.Conta;
import repository.impl.ContaDAO;
import repository.impl.ContaDAOimpl;

import java.util.List;

public class ContaServiceimpl implements ContaService {
    private ContaDAO repository = new ContaDAOimpl();

    @Override
    public void create(Conta parametro) {
        repository.create(parametro);
    }

    @Override
    public List<Conta> readAll() {
        return repository.readAll();
    }

    @Override
    public void update(String nome, Conta parametro) {
        repository.update(nome,parametro);

    }

    @Override
    public void delete(String nome) {
        repository.delete(nome);

    }
}