package com.banco.config;

import com.banco.controller.ContaController;
import com.banco.model.Conta;

import java.time.LocalDate;
import java.time.Month;

public class ContaConfig {
    public static void contaInit() {
        Conta conta1 = new Conta();
        LocalDate data = LocalDate.of(2020, Month.AUGUST, 8);
        conta1.setNome("Lucas");
        conta1.setCpfCnpj("1234567891");
        conta1.setEmail("lucas@gmail.com");
        conta1.setSenha("8560");
        conta1.setDataCriacao(data);

        Conta conta2 = new Conta();
        LocalDate da = LocalDate.of(2020, Month.SEPTEMBER, 20);
        conta2.setNome("Antonio");
        conta2.setEmail("antonio@gmail.com");
        conta2.setCpfCnpj("1234567892");
        conta2.setSenha("8561");
        conta2.setDataCriacao(da);

        Conta conta3 = new Conta();
        LocalDate d = LocalDate.of(2020, Month.JANUARY, 18);
        conta3.setNome("Louzano");
        conta3.setEmail("louzano@gmail.com");
        conta3.setCpfCnpj("1234567893");
        conta3.setSenha("8562");
        conta3.setDataCriacao(d);

        Conta conta4 = new Conta();
        LocalDate dat = LocalDate.of(2020, Month.DECEMBER, 5);
        conta4.setNome("Rafael");
        conta4.setEmail("rafael@gmail.com");
        conta4.setCpfCnpj("1234567894");
        conta4.setSenha("8563");
        conta4.setDataCriacao(dat);

        ContaController contro = new ContaController();
        contro.create(conta2);
        contro.create(conta1);
        contro.create(conta4);
        contro.create(conta3);
    }

    public static void main(String[] args)  {
        contaInit();
    }

}
