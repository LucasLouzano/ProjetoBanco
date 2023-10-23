package estudo;
import config.FuncionarioConfig;
import controller.FuncionarioController;
public class TesteDeleteFuncionario {
    public static void main(String[] args) {
        FuncionarioConfig.funcionarioInit();
        FuncionarioController controller = new FuncionarioController();
        boolean funcionarioDeletado = controller.delete("12345678978");
        if (funcionarioDeletado) {
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado ou não foi possível remover.");
        }
        controller.readAll().forEach(f -> {
            System.out.println(f.getNome());
        });
    }
}