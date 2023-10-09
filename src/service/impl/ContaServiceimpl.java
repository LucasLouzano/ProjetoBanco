package service.impl;

import model.Conta;
import repository.ContaDAO;
import repository.impl.ContaDAOimpl;
import service.ContaService;
import java.util.List;

public class ContaServiceimpl implements ContaService {

    private ContaDAO repository = new ContaDAOimpl();
    List<Conta> contas = repository.readAll();

    @Override
    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        repository.create(parametro);
    }
    @Override
    public List<Conta> readAll() {
        for (Conta parametro : contas) {
            String addPontosETracos = adicionarPontosETracos(parametro.getNome());
            parametro.setNome(addPontosETracos);
        }
        return contas;
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replaceAll(" ", ".").replaceAll("-", ".");
        return nome;
    }

    @Override
    public boolean update(String nome, Conta parametro) {
        return repository.update(nome, parametro);
    }

    @Override
    public boolean delete(String nome) {
      return repository.delete(nome);

    }
}
