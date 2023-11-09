package com.banco.estudo;
import com.banco.config.ContaConfig;
import com.banco.controller.ContaController;
import com.banco.model.Conta;
public class ContaTesteAlgoritmos {
    public static void main(String[] args) {
        ContaConfig.contaInit();
        ContaController contr = new ContaController();
        Conta conta = contr.read("12345678978");
        System.out.println(conta.getNome());
        contr.readAll().forEach(c -> {
            System.out.println(c.getCpfCnpj());
        });
    }
}
