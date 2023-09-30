package controller;

import service.impl.ContaService;
import service.impl.ContaServiceimpl;
import model.Conta;

import java.util.List;

public class ContaController {
    private ContaService service = new ContaServiceimpl();

    public void create(Conta parametro) {
        String SemPontos = parametro.getCpfCnpj().replaceAll("[.-]", "");
        parametro.setCpfCnpj(SemPontos);
        parametro.setNome(parametro.getNome() + " Louzano ");
        service.create(parametro);
        // remover pontos e traços
    }

    // adicionar pontos e traços
    public List<Conta> readAll() {
        List<Conta> parametros = service.readAll();
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

    public void update(String nome, Conta parametro) {
        service.update(nome, parametro);
    }

    public void delete(String nome) {
        service.delete(nome);

    }
}
