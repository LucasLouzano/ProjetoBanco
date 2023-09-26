import Cliente.Clientes;
import Controller.ClienteCRUD;
import Controller.ContaRendimento;
import Funcionarios.Funcionarios;
import Model.ContaBancaria;
import Model.ContaCorrente;
import Repository.ClientesRepository;
import Repository.Rendimento;

import java.util.*;

public class Main {
    public static void main(String[] args) {
            ContaBancaria c1 = new ContaCorrente();
            Date d1 = new Date();
            c1.setDataCriacao(d1);
            c1.setAgencia("12345678912");
            c1.setNumeroConta("123456");

            Clientes c2 = new Clientes();
            c2.setId(660);
            c2.setNome("Lucas");
            c2.setEmail("Lucas@gmail.com");
            c2.setCpfCnpj("399.356.698.22");

            ClientesRepository conta = new ClienteCRUD();
            conta.create(c2);
            List<Clientes> Clientescontas = conta.readAll();
            Clientescontas.forEach(c -> {
                System.out.println(c.toString());
            });


            Rendimento repository = new ContaRendimento();
            repository.create(c1);

            List<ContaBancaria> contasDataBase = repository.readAll();
            contasDataBase.forEach(c -> {
                System.out.println(c.toString());
            });
        }
    }

