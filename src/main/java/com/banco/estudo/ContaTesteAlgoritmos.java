package com.banco.estudo;
import com.banco.config.ContaConfig;
import com.banco.controller.ContaController;
import com.banco.model.Conta;
public class ContaTesteAlgoritmos {
    public static void main(String[] args) throws Exception {
        ContaConfig.contaInit();
        ContaController contr = new ContaController();
        Conta conta = contr.read("33.700.394/0001-42");
        System.out.println(conta.getCpfCnpj());
        contr.readAll().forEach(c -> {
            System.out.println(c.getCpfCnpj());


        });
    }
}
