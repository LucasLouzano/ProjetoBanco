package com.banco.gui;

import java.util.Scanner;

import com.banco.config.FuncionarioConfig;
import com.banco.controller.FuncionarioController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.Funcionario;

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
                try {
                    controller.create(funcionario);
                    System.out.println("\n Funcionario cadastrado com sucesso!");
                } catch (Exception e) {
                    System.out.println("============================");
                    System.out.println("Cpf menor do que 11 dígitos.");
                    System.out.println("============================");
                    System.out.println("Retornando para o menu principal.");
                }



            } else if (opcao == 2) {
                try {
                    System.out.println("Digite o cpf");
                    String ClienteCpf = scan.next();
                    Funcionario funcionario = controller.read(ClienteCpf);
                    System.out.println("Conta cadastrada cpf existente: " + funcionario.getCpfCnpj());
                    System.out.println("Nome:" +funcionario.getNome());
                } catch (Exception e) {
                    System.out.println("============================");
                    System.out.println("não foi possivel validar a funcionario, cpf não existe.");
                    System.out.println("============================");
                    System.out.println("Retornando para busca do funcionario.");

                }
            } else if (opcao == 3) {
                System.out.println("\n Listando todos os funcionarios: \n");
                controller.readAll().forEach(f -> {
                    System.out.println("===" + f.getNome() + "===");
                });

            } else if (opcao == 4) {
                System.out.print("Digite o cpf desejado: ");
                String cpfDesejado = scan.next();
                controller.readAll().forEach(funcionario -> {
                    if (funcionario.getCpfCnpj().equals(cpfDesejado)) {
                        System.out.println("Funcionario encontrado - Nome : " + funcionario.getNome());
                    }
                });

            } else if (opcao == 5) {
                System.out.println("Digite o cpf para deletar o funcionario");
                String cpfDeletar = scan.next();
                Funcionario funcionarioDeletado = controller.read(cpfDeletar);
                if (funcionarioDeletado != null && controller.delete(cpfDeletar)){
                    System.out.println("Funcionario " + funcionarioDeletado.getNome() + " removido com sucesso!");
                } else {
                    System.out.println("Funcionario não encontrado, ou não foi possível remover.");
                }
            }
        }
        System.out.println("Fim da aplicação!");
    }
}
