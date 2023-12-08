package com.banco.gui;

import java.util.List;
import java.util.Scanner;

import com.banco.config.ClienteConfig;
import com.banco.controller.ClienteController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;

public class MainGUIClientes {
    public static void main(String[] args) throws CpfCnpjException {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        ClienteConfig.clienteInit();
        ClienteController controller = new ClienteController();
        while (opcao != 98){
            System.out.println(ConstantesGUI.LOGIN.getValor());
            opcao = scan.nextInt();
            if (opcao == 1){
                Cliente cliente = new Cliente();
                System.out.println("digite o email");
                String email = scan.next();
                System.out.println("Digite a senha");
                String senha = scan.next();
            }
        }

        while (opcao != 99) { // enquanto
            System.out.println(ConstantesGUI.CADASTRO.getValor());
            opcao = scan.nextInt();
            if (opcao == 1) {
                Cliente cliente = new Cliente();
                System.out.print("Digite o nome: ");
                String nome = scan.next();
                System.out.print("Digite o email: ");
                String email = scan.next();
                System.out.print("Digite o cpf: ");
                String cpf = scan.next();
                cliente.setNome(nome);
                cliente.setEmail(email);
                cliente.setCpfCnpj(cpf);
                try {
                    controller.create(cliente);
                    System.out.println("\n Cliente cadastrado com sucesso!");
                } catch (CpfCnpjException e) {
                    System.out.println("============================");
                    System.out.println("Cpf menor do que 11 dígitos.");
                    System.out.println("============================");
                    System.out.println("Retornando para o menu principal.");
                }


            } else if (opcao == 2) {
                try {
                    System.out.println("Digite o cpf");
                    String ClienteCpf = scan.next();
                    Cliente cliente = controller.read(ClienteCpf);
                    System.out.println("Conta cadastrada cpf existente: " + cliente.getCpfCnpj());
                    System.out.println("Nome:" + cliente.getNome());
                } catch (Exception e) {
                    System.out.println("============================");
                    System.out.println("não foi possivel validar a conta, cpf não existe.");
                    System.out.println("============================");
                    System.out.println("Retornando para busca do cliente.");

                }

            } else if (opcao == 3) {
                System.out.println("\n Listando todos os clientes: \n");
                controller.readAll().forEach(f -> {
                    System.out.println("===" + f.getNome() + "===");
                });

            } else if (opcao == 4) {
                System.out.print("Digite o cpf desejado: ");
                String cpfDesejado = scan.next();
                controller.readAll().forEach(cliente -> {
                    if (cliente.getCpfCnpj().equals(cpfDesejado)) {
                        System.out.println("Cliente encontrado - Nome : " + cliente.getNome());
                    }
                });


            } else if (opcao == 5) {
                System.out.println("Digite o cpf para deletar o cliente");
                String cpfDeletar = scan.next();
                Cliente clienteDeletado = controller.read(cpfDeletar);
                if (clienteDeletado != null && controller.delete(cpfDeletar)){
                    System.out.println("Cliente " +clienteDeletado.getNome() + " removido com sucesso!");
                } else {
                    System.out.println("Cliente não encontrado, ou não foi possível remover.");
                }
            }
        }
        System.out.println("Fim da aplicação!");
    }
}

