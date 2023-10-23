package service.impl;
import model.Conta;
import repository.ContaDAO;
import repository.impl.ContaDAOimpl;
import service.ContaService;
import java.util.List;

public class ContaServiceimpl implements ContaService {
    private ContaDAO repository = new ContaDAOimpl();

    @Override
    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        repository.create(parametro);
    }
    @Override
    public List<Conta> readAll() {
        return repository.readAll();
    }
    @Override
    public boolean update(String nome, Conta parametro) {
        return repository.update(nome, parametro);
    }
    @Override
    public boolean delete(String cpf) {
        return repository.delete(cpf);
    }
    @Override
    public Conta read(String cpf) {
        return repository.read(cpf);
    }
}
