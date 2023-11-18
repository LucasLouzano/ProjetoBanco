package com.banco.config;
import java.util.Date;

import com.banco.controller.ContaController;
import com.banco.exceptions.CpfException;
import com.banco.model.Conta;
public class ContaConfig {
    public static void contaInit() {


        Conta conta1 = new Conta();
        conta1.setNome("Lucas");
        conta1.setEmail("lucas@gmail.com");
        conta1.setDataNascimento(new Date(90));
        conta1.setCpfCnpj("12345678978");

        Conta conta2 = new Conta();
        conta2.setNome("Antonio");
        conta2.setEmail("antonio@gmail.com");
        conta2.setDataNascimento(new Date(95));
        conta2.setCpfCnpj("42345678978");

        Conta conta3 = new Conta();
        conta3.setNome("Louzano");
        conta3.setEmail("louzano@gmail.com");
        conta3.setDataNascimento(new Date(92));
        conta3.setCpfCnpj("83992558282");

        Conta conta4 = new Conta();
        conta4.setNome("Teste");
        conta4.setEmail("teste@gmail.com");
        conta4.setDataNascimento(new Date(87));
        conta4.setCpfCnpj("22345678978");

        ContaController contro = new ContaController();
        contro.create(conta2);
        contro.create(conta1);
        contro.create(conta4);
        contro.create(conta3);
    }

    public static void main(String[] args) {
        contaInit();
    }

}
