package config;

import controller.FuncionarioController;
import model.Funcionario;

public class FuncionarioConfig {
    public static void funcionarioInit() {
        Funcionario func1 = new Funcionario();
        func1.setNome("Lucas");
        func1.setEmail("lucas@gmail.com");
        func1.setIdade(10);
        func1.setCpfCnpj("12345678978");

        Funcionario func2 = new Funcionario();
        func2.setNome("Antonio");
        func2.setEmail("lucas@gmail.com");
        func2.setIdade(10);
        func2.setCpfCnpj("42345678978");

        Funcionario func3 = new Funcionario();
        func3.setNome("Louzano");
        func3.setEmail("lucas@gmail.com");
        func3.setIdade(10);
        func3.setCpfCnpj("82345678978");

        Funcionario func4 = new Funcionario();
        func4.setNome("Teste");
        func4.setEmail("lucas@gmail.com");
        func4.setIdade(10);
        func4.setCpfCnpj("22345678978");

        FuncionarioController controller = new FuncionarioController();
        controller.create(func2);
        controller.create(func1);
        controller.create(func4);
        controller.create(func3);

    }
}
