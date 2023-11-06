package config;

import controller.FuncionarioController;
import model.Funcionario;

import java.util.Date;

public class FuncionarioConfig {
    public static void funcionarioInit() {
        Funcionario func1 = new Funcionario();
        func1.setNome("Lucas");
        func1.setEmail("lucas@gmail.com");
        func1.setNascimento(new Date(90));
        func1.setCpfCnpj("123.456.789-78");

        Funcionario func2 = new Funcionario();
        func2.setNome("Antonio");
        func2.setEmail("antonio@gmail.com");
        func2.setNascimento(new Date(95));
        func2.setCpfCnpj("423.456.789-78");

        Funcionario func3 = new Funcionario();
        func3.setNome("Louzano");
        func3.setEmail("louzano@gmail.com");
        func3.setNascimento(new Date(91));
        func3.setCpfCnpj("823.456.789-78");

        Funcionario func4 = new Funcionario();
        func4.setNome("Teste");
        func4.setEmail("teste@gmail.com");
        func4.setNascimento(new Date(93));
        func4.setCpfCnpj("223.456.789-78");

        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome("Douglas");
        novoFuncionario.setEmail("douglas@gmail.com");
        novoFuncionario.setNascimento(new Date(87));
        novoFuncionario.setCpfCnpj("923.456.789-78");


        FuncionarioController controller = new FuncionarioController();
        controller.create(func2);
        controller.create(func1);
        controller.create(novoFuncionario);
        controller.create(func4);
        controller.create(func3);


    }
}
