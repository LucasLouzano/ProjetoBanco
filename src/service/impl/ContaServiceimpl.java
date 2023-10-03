package Service.impl;

import model.Cliente;
import model.Conta;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;
import repository.impl.ContaDAO;
import repository.impl.ContaDAOimpl;

import java.util.ArrayList;
import java.util.List;

public class ContaServiceimpl implements ContaDAO, ContaService {
    private ContaDAO repository = new ContaDAOimpl();
    private List<Cliente> Data = new ArrayList<>();

    @Override
    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        parametro.setNome(parametro.getNome() + " Louzano ");
        repository.create(parametro);
        // remover pontos e traços
    }

    @Override
    public List<Conta> readAll() {
        List<Conta> parametros = repository.readAll();
        for (Conta parametro : parametros) {
            String addPontosETracos = adicionarPontosETracos(parametro.getNome());
            parametro.setNome(addPontosETracos);
        }
        return parametros;
    }

    private String adicionarPontosETracos(String nome) {
        nome = nome.replaceAll(" ", ".").replaceAll("-", ".");
        return nome;
    }

    @Override
    public void update(String nome, Conta parametro) {
        repository.update(nome, parametro);

    }

    @Override
    public void delete(String nome) {
        repository.delete(nome);

    }
}
