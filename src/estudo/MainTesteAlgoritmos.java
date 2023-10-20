package estudo;
import config.FuncionarioConfig;
import controller.FuncionarioController;
import model.Funcionario;

public class MainTesteAlgoritmos {

    public static void main(String[] args) {
        FuncionarioConfig.funcionarioInit();
        FuncionarioController controller = new FuncionarioController();
        Funcionario funcionario = controller.read("82345678978");
        System.out.println(funcionario.getNome());
        controller.readAll().forEach(f -> {System.out.println(f.getCpfCnpj());
        });
    }
}


