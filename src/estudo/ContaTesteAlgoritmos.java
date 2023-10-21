package estudo;
import config.ContaConfig;
import controller.ContaController;
import model.Conta;
public class ContaTesteAlgoritmos {
    public static void main(String[] args) {
        ContaConfig.contaInit();
        ContaController contr = new ContaController();
        Conta conta = contr.read("12345678978");
        System.out.println(conta.getNome());
        contr.readAll().forEach(c -> {
            System.out.println(c.getCpfCnpj());
        });
    }
}
