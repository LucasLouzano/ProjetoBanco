package config;

import controller.ClienteController;
import model.Cliente;

public class ClienteConfig {
    public static void clienteInit() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lucas");
        cliente1.setEmail("lucas@gmail.com");
        cliente1.setIdade(10);
        cliente1.setCpfCnpj("12345678978");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Antonio");
        cliente2.setEmail("lucas@gmail.com");
        cliente2.setIdade(10);
        cliente2.setCpfCnpj("42345678978");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Louzano");
        cliente3.setEmail("lucas@gmail.com");
        cliente3.setIdade(10);
        cliente3.setCpfCnpj("83992558282");

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Teste");
        cliente4.setEmail("lucas@gmail.com");
        cliente4.setIdade(10);
        cliente4.setCpfCnpj("22345678978");

        ClienteController contro = new ClienteController();
        contro.create(cliente2);
        contro.create(cliente1);
        contro.create(cliente4);
        contro.create(cliente3);

    }
}

