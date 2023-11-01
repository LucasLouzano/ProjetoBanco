package gui;

import java.util.Scanner;

import config.FuncionarioConfig;
import controller.FuncionarioController;
import model.Funcionario;

public class MainGUIFuncionarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        FuncionarioConfig.funcionarioInit();
        FuncionarioController controller = new FuncionarioController();

        while (opcao != 99) { // enquanto
            System.out.println(ConstantesGUI.MENU.getValor());
            opcao = scan.nextInt();

                if (opcao == 1) {
                    Funcionario funcionario = new Funcionario();
                    System.out.print("Digite o nome: ");
                    String nome = scan.next();
                    System.out.print("Digite o email: ");
                    String email = scan.next();
                    System.out.print("Digite o cpf: ");
                    String cpf = scan.next();
                    funcionario.setNome(nome);
                    funcionario.setEmail(email);
                    funcionario.setCpfCnpj(cpf);
                    controller.create(funcionario);
                    System.out.println("\nFuncionário cadastrado com sucesso!");

                } else if (opcao == 2) {

                } else if (opcao == 3) {
                    System.out.println("\nFuncionários: \n");
                    controller.readAll().forEach(f -> {
                        System.out.println("===" + f.getNome() + "===");
                    });
                }
            }

            System.out.println("Fim da aplicação!");

        }
    }

