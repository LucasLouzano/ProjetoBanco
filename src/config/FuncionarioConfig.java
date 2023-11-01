package config;

import controller.FuncionarioController;
import model.Funcionario;

import java.util.Date;

public class FuncionarioConfig {
    public static void funcionarioInit() {
        Funcionario func1 = new Funcionario();
        func1.setNome("Lucas");
        func1.setEmail("lucas@gmail.com");
        func1.setNascimento(new Date());
        func1.setCpfCnpj("123.456.789-78");

        Funcionario func2 = new Funcionario();
        func2.setNome("Antonio");
        func2.setEmail("lucas@gmail.com");
        func2.setNascimento(new Date(10));
        func2.setCpfCnpj("423.456.789-78");

        Funcionario func3 = new Funcionario();
        func3.setNome("Louzano");
        func3.setEmail("lucas@gmail.com");
        func3.setNascimento(new Date());
        func3.setCpfCnpj("823.456.789-78");

        Funcionario func4 = new Funcionario();
        func4.setNome("Teste");
        func4.setEmail("lucas@gmail.com");
        func4.setNascimento(new Date());
        func4.setCpfCnpj("223.456.789-78");

        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome("Douglas");
        novoFuncionario.setEmail("douglas@gmail.com");
        novoFuncionario.setNascimento(new Date());
        novoFuncionario.setCpfCnpj("923.456.789-78");


        FuncionarioController controller = new FuncionarioController();
        controller.create(func2);
        controller.create(func1);
        controller.create(novoFuncionario);
        controller.create(func4);
        controller.create(func3);


    }
}
