package estudo;
import config.ContaConfig;
import config.FuncionarioConfig;
import controller.ContaController;
import controller.FuncionarioController;

public class TesteDeleteConta {
    public static void main(String[] args) {
        ContaConfig.contaInit();
        ContaController contro = new ContaController();
        boolean contadelete = contro.delete("22345678978");
        if (contadelete) {
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado ou não foi possível remover.");
        }
        contro.readAll().forEach(f -> {
            System.out.println(f.getNome());
        });
    }
}
