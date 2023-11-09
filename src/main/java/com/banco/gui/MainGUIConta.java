package com.banco.gui;
import java.util.Scanner;

import com.banco.config.ContaConfig;
import com.banco.controller.ContaController;
import com.banco.model.Conta;
public class MainGUIConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        ContaConfig.contaInit();
        ContaController controller = new ContaController();

        while (opcao != 99) { // enquanto
            System.out.println(ConstantesGUI.CADASTRARCONTA.getValor());
            opcao = scan.nextInt();

            if (opcao == 1) {
                Conta conta = new Conta();
                System.out.print("Digite o nome: ");
                String nome = scan.next();
                System.out.print("Digite o email: ");
                String email = scan.next();
                System.out.print("Digite o cpf: ");
                String cpf = scan.next();
                conta.setNome(nome);
                conta.setEmail(email);
                conta.setCpfCnpj(cpf);
                controller.create(conta);
                System.out.println("\n Conta cadastrada com sucesso!");

            } else if (opcao == 2) {
                System.out.println("\n Conta Cadastrada: \n");
                Conta conta = controller.read("12345678978");
                System.out.println(conta.getNome());
                controller.readAll().forEach(c -> {
                    System.out.println(c.getNome());
                });
            } else if (opcao == 3) {
                System.out.println("\n Listando conta: \n");
                controller.readAll().forEach(f -> {
                    System.out.println("===" + f.getNome() + "===");
                });
            } else if (opcao == 4) {
                boolean contadelete = controller.delete("22345678978");
                if (contadelete) {
                    System.out.println("conta removida, com sucesso!");
                } else {
                    System.out.println("Conta não encontrada, ou não foi possível remover.");
                }
                controller.readAll().forEach(f -> {
                    System.out.println(f.getNome());
                });


            }
        }

        System.out.println("Fim da aplicação!");

    }
}

