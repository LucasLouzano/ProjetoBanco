package com.banco.gui;

import java.util.Scanner;

import com.banco.config.ContaConfig;
import com.banco.controller.ContaController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
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
                try {
                    controller.create(conta);
                    System.out.println("\n Conta cadastrada com sucesso!");
                } catch (Exception e) {
                    System.out.println("============================");
                    System.out.println("Cpf menor do que 11 dígitos.");
                    System.out.println("============================");
                    System.out.println("Retornando para o menu principal.");
                }

            } else if (opcao == 2) {
                try {
                    System.out.println("Digite o cpf");
                    String ContaCpf = scan.next();
                    Conta conta = controller.read(ContaCpf);
                    System.out.println("Conta cadastrada cpf existente: " + conta.getCpfCnpj());
                    System.out.println("Nome:" + conta.getNome());
                } catch (Exception e) {
                    System.out.println("============================");
                    System.out.println("não foi possivel validar a conta, cpf não existe.");
                    System.out.println("============================");
                    System.out.println("Retornando para busca da conta.");
                }

            } else if (opcao == 3) {
                System.out.println("\n Listando todas as contas: \n");
                controller.readAll().forEach(f -> {
                    System.out.println("===" + f.getNome() + "===");
                });


            } else if (opcao == 4) {
                System.out.print("Digite o cpf desejado: ");
                String cpfDesejado = scan.next();
                controller.readAll().forEach(conta -> {
                    if (conta.getCpfCnpj().equals(cpfDesejado)) {
                        System.out.println("Conta encontrada - Nome : " + conta.getNome());
                    }
                });

            } else if (opcao == 5) {
                System.out.println("Digite o cpf para deletar o cliente");
                String cpfDeletar = scan.next();
                Conta contaDeletado = controller.read(cpfDeletar);
                if (contaDeletado != null && controller.delete(cpfDeletar)){
                    System.out.println("Cliente " + contaDeletado.getNome() + " removido com sucesso!");
                } else {
                    System.out.println("Cliente não encontrado, ou não foi possível remover.");
                }
            }
        }
        System.out.println("Fim da aplicação!");
    }
}
