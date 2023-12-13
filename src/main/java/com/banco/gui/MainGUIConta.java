package com.banco.gui;

import java.util.List;
import java.util.Scanner;

import com.banco.config.ClienteConfig;
import com.banco.config.ContaConfig;
import com.banco.controller.ContaController;
import com.banco.model.Conta;

public class MainGUIConta {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        ClienteConfig.clienteInit();
        ContaConfig.contaInit();
        ContaController controller = new ContaController();

        while (opcao != 99) { // enquanto
            System.out.println(ConstantesGUI.CADASTRARCONTA.getValor());
            opcao = scan.nextInt();

            if (opcao == 1) {
                Conta conta = new Conta();
                System.out.print("Digite o email: ");
                String email = scan.next();
                System.out.println("Digite o cpf:");
                String cpf = scan.next();
                System.out.print("Digite o número da agencia: ");
                String agencia = scan.next();
                System.out.println("Digite o número da conta:");
                String numConta = scan.next();
                conta.setEmail(email);
                conta.setCpfCnpj(cpf);
                conta.setAgencia(agencia);
                conta.setNumeroConta(numConta);
                controller.create(conta);
                try {
                    controller.create(conta);
                    System.out.println("\n Conta cadastrada com sucesso!");
                } catch (Exception e) {
                    System.out.println("============================");
                    System.out.println("Número da agencia menor que 4 digitos, e número conta menor que 11 digitos.");
                    System.out.println("============================");
                    System.out.println("Retornando para o menu principal.");
                }

            } else if (opcao == 2) {
                try {
                    System.out.println("Digite o cpf");
                    String ContaCpf = scan.next();
                    Conta conta = controller.read(ContaCpf);
                    System.out.println("Conta existente cpf: " + conta.getCpfCnpj());
                } catch (Exception e) {
                    System.out.println("============================");
                    System.out.println("não foi possivel validar a conta, cpf não existe.");
                    System.out.println("============================");
                    System.out.println("Retornando para busca da conta.");
                }

            } else if (opcao == 3) {
                System.out.println("\n Listando todas as contas: \n");
                List<Conta> contas = controller.readAll();
                contas.forEach(f -> {
                    System.out.println("Cpf: " + f.getCpfCnpj() + "===");
                });


            } else if (opcao == 4) {
                System.out.print("Digite o cpf desejado: ");
                String cpfDesejado = scan.next();
                controller.readAll().forEach(conta -> {
                    if (conta.getCpfCnpj().equals(cpfDesejado)) {
                        System.out.println("Conta encontrada - CPF : " + cpfDesejado);
                    }
                });

            } else if (opcao == 5) {
                try {
                    System.out.println("Digite o cpf para deletar a conta ");
                    String cpfDeletar = scan.next();
                    Conta contaDeletado = controller.read(cpfDeletar);
                    if (contaDeletado != null && controller.delete(cpfDeletar)) {
                        System.out.println("Conta " + contaDeletado.getCpfCnpj() + " removida com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada, ou não foi possível remover.");
                    }
                } catch (Exception e) {
                    System.out.println(" Voltar ao menu ");
                }

            }
        }
        System.out.println("Fim da aplicação!");
    }
}
