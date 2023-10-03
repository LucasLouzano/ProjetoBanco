package controller;

import Service.impl.ContaService;
import Service.impl.ContaServiceimpl;
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

        public void update(String nome, Conta parametro) {
            service.update(nome, parametro);
        }

        public void delete(String nome) {
            service.delete(nome);

        }
    }

