package estudo;

import config.ClienteConfig;
import config.FuncionarioConfig;
import controller.ClienteController;
import controller.FuncionarioController;
import model.Cliente;

public class TesteDeleteFuncionario {
    public static void main(String[] args) {
        FuncionarioConfig.funcionarioInit();
        FuncionarioController controller = new FuncionarioController();
        controller.delete("12345678978");
        controller.readAll().forEach(f -> {
            System.out.println(f.getNome());
        });
    }
}