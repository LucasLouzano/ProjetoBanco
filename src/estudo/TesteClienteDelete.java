package estudo;

import config.ClienteConfig;
import controller.ClienteController;

public class TesteClienteDelete {
    public static void main(String[] args) {
        ClienteConfig.clienteInit();
        ClienteController contro = new ClienteController();
        contro.delete("22345678978");
        contro.readAll().forEach(c -> {
            System.out.println(c.getNome());
        });
    }
}

