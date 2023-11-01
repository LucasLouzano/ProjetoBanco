package gui;

import config.ClienteConfig;
import controller.ClienteController;
import model.Cliente;

import java.util.Scanner;

public class MainGUIClientes {
    public static void main(String[] args) {
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
                    controller.create(cliente);
                    System.out.println("\n Cliente cadastrado com sucesso!");

                } else if (opcao == 2) {

                } else if (opcao == 3) {
                    System.out.println("\n Cliente: \n");
                    controller.readAll().forEach(f -> {
                        System.out.println("===" + f.getNome() + "===");
                    });
                }
            }

            System.out.println("Fim da aplicação!");

        }
    }
