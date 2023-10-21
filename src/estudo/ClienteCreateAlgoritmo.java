package estudo;

import config.ClienteConfig;
import controller.ClienteController;
import model.Cliente;

public class ClienteCreateAlgoritmo {
    public static void main(String[] args) {
        ClienteConfig.clienteInit();
        ClienteController contro = new ClienteController();
        Cliente cliente = contro.read("12345678978");
        System.out.println(cliente.getNome());
        contro.readAll().forEach(c -> {
            System.out.println(c.getCpfCnpj());
        });
    }
}