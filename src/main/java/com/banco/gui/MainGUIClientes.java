package com.banco.gui;

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
                System.out.println("\n A Busca foi concluida: \n");
                Cliente cliente = controller.read("12345678978");
                System.out.println(cliente.getNome());
                controller.readAll().forEach(c -> {
                    System.out.println(c.getNome());
                });
            } else if (opcao == 3) {
                System.out.println("\n Listando todos os clientes: \n");
                controller.readAll().forEach(f -> {
                    System.out.println("===" + f.getNome() + "===");
                });

            } else if (opcao == 4) {
                System.out.println("\n deletando todos os clientes: \n");
                boolean clientedelete = controller.delete("22345678978");
                if (clientedelete) {
                    System.out.println("Cliente removido com sucesso!");
                } else {
                    System.out.println("Cliente não encontrado, ou não foi possível remover.");
                }
                controller.readAll().forEach(f -> {
                    System.out.println(f.getNome());
                });
            }
        }


        System.out.println("Fim da aplicação!");

    }
}
