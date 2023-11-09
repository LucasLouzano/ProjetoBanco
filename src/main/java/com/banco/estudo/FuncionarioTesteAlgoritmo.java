package com.banco.estudo;
import com.banco.config.FuncionarioConfig;
import com.banco.controller.FuncionarioController;
import com.banco.model.Funcionario;

public class FuncionarioTesteAlgoritmo {

    public static void main(String[] args) {
        FuncionarioConfig.funcionarioInit();
        FuncionarioController controller = new FuncionarioController();
        Funcionario funcionario = controller.read("82345678978");
        System.out.println(funcionario.getNome());
        controller.readAll().forEach(f -> {System.out.println(f.getCpfCnpj());
        });
    }
}


