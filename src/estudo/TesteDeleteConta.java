package estudo;
import config.ContaConfig;
import controller.ContaController;
public class TesteDeleteConta {
    public static void main(String[] args) {
        ContaConfig.contaInit();
        ContaController contr = new ContaController();
        contr.delete("22345678978");
        contr.readAll().forEach(c -> {
        System.out.println(c.getNome());
        });
    }
}


