package gui;

import config.ClienteConfig;
import config.ContaConfig;
import controller.ClienteController;
import controller.ContaController;
import model.Cliente;
import model.Conta;

import java.util.Scanner;
public class MainGUIConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        ContaConfig.contaInit();
        ContaController controller = new ContaController();

        while (opcao != 99) { // enquanto
            System.out.println(ConstantesGUI.CADASTROCONTA.getValor());
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

