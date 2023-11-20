package com.banco.config;
import java.time.LocalDate;
import java.time.Month;

import com.banco.controller.ContaController;
import com.banco.model.Conta;
public class ContaConfig {
    public static void contaInit() {


        Conta conta1 = new Conta();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        conta1.setNome("Lucas");
        conta1.setEmail("lucas@gmail.com");
        conta1.setDataNascimento(dataNascimento);
        conta1.setCpfCnpj("12345678978");

        Conta conta2 = new Conta();
        LocalDate dNascimento = LocalDate.of(1995, Month.JUNE, 8);
        conta2.setNome("Antonio");
        conta2.setEmail("antonio@gmail.com");
        conta2.setDataNascimento(dNascimento);
        conta2.setCpfCnpj("42345678978");

        Conta conta3 = new Conta();
        LocalDate taNascimento = LocalDate.of(1992, Month.JUNE, 8);
        conta3.setNome("Louzano");
        conta3.setEmail("louzano@gmail.com");
        conta3.setDataNascimento(taNascimento);
        conta3.setCpfCnpj("83992558282");

        Conta conta4 = new Conta();
        LocalDate daNascimento = LocalDate.of(1987, Month.JUNE, 8);
        conta4.setNome("Teste");
        conta4.setEmail("teste@gmail.com");
        conta4.setDataNascimento(daNascimento);
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
