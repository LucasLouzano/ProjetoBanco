import config.FuncionarioConfig;
import controller.FuncionarioController;
import model.Funcionario;
public class MainFuncionario {
    public static void main(String[] args) {
        FuncionarioConfig.funcionarioInit();
        FuncionarioController controller = new FuncionarioController();
        // Crie um novo funcionário com um CPF/CNPJ
     //   Funcionario novoFuncionario = new Funcionario();
        Funcionario novoFuncionario = controller.read("92345678978");// Substitua pelo CPF/CNPJ desejado
        System.out.println(novoFuncionario.getNome());
        controller.readAll().forEach(f -> {System.out.println(f.getCpfCnpj());
        });

    }
}
