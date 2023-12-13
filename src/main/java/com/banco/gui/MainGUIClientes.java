package com.banco.gui;

import java.util.Scanner;

import com.banco.config.ClienteConfig;
import com.banco.config.ContaConfig;
import com.banco.controller.ClienteController;
import com.banco.exceptions.LoginInvalidoException;
import com.banco.model.LoginDTO;

public class MainGUIClientes {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        ClienteConfig.clienteInit();
        ContaConfig.contaInit();
        ClienteController controller = new ClienteController();

        boolean loginValido = false;

        while (opcao != 98) {
            System.out.println(ConstantesGUI.LOGIN.getValor());
            opcao = scan.nextInt();

            if (opcao == 1) {
                try {
                    System.out.println("Digite o email");
                    String email = scan.next();
                    System.out.println("Digite a senha");
                    String senha = scan.next();

                    System.out.println("Validando o login:");
                    LoginDTO login = new LoginDTO(email, senha);
                    if (controller.login(login)) {
                        System.out.println("Login realizado");
                        MainGUIConta.main(new String[]{});

                        loginValido = true;
                        break;
                    } else {
                        throw new LoginInvalidoException("Login inválido");
                    }
                } catch (LoginInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        if (!loginValido) {
            System.out.println("Reiniciando a aplicação...");
        }
    }
}




