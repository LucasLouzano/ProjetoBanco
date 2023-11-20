package com.banco.config;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import com.banco.controller.FuncionarioController;
import com.banco.model.Funcionario;

public class FuncionarioConfig {
    public static void funcionarioInit() {
        Funcionario func1 = new Funcionario();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        func1.setNome("Lucas");
        func1.setEmail("lucas@gmail.com");
        func1.setNascimento(dataNascimento);
        func1.setCpfCnpj("123.456.789-78");

        Funcionario func2 = new Funcionario();
        LocalDate Nascimento = LocalDate.of(1995, Month.JUNE, 9);
        func2.setNome("Antonio");
        func2.setEmail("antonio@gmail.com");
        func2.setNascimento(Nascimento);
        func2.setCpfCnpj("423.456.789-78");

        Funcionario func3 = new Funcionario();
        LocalDate daNascimento = LocalDate.of(1992, Month.JUNE, 10);
        func3.setNome("Louzano");
        func3.setEmail("louzano@gmail.com");
        func3.setNascimento(daNascimento);
        func3.setCpfCnpj("823.456.789-78");

        Funcionario func4 = new Funcionario();
        LocalDate taNascimento = LocalDate.of(1987, Month.JUNE, 8);
        func4.setNome("Teste");
        func4.setEmail("teste@gmail.com");
        func4.setNascimento(taNascimento);
        func4.setCpfCnpj("223.456.789-78");


        FuncionarioController controller = new FuncionarioController();
        controller.create(func2);
        controller.create(func1);
        controller.create(func4);
        controller.create(func3);


    }
}
