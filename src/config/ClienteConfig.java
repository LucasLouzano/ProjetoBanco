package config;

import controller.ClienteController;
import model.Cliente;

import java.util.Date;

public class ClienteConfig {
    public static void clienteInit() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lucas");
        cliente1.setEmail("lucas@gmail.com");
        cliente1.setNascimento(new Date(90));
        cliente1.setCpfCnpj("12345678978");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Antonio");
        cliente2.setEmail("antonio@gmail.com");
        cliente2.setNascimento(new Date(95));
        cliente2.setCpfCnpj("42345678978");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Louzano");
        cliente3.setEmail("louzano@gmail.com");
        cliente3.setNascimento(new Date(92));
        cliente3.setCpfCnpj("83992558282");

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Teste");
        cliente4.setEmail("teste@gmail.com");
        cliente4.setNascimento(new Date(89));
        cliente4.setCpfCnpj("22345678978");

        ClienteController contro = new ClienteController();
        contro.create(cliente2);
        contro.create(cliente1);
        contro.create(cliente4);
        contro.create(cliente3);

    }
}

