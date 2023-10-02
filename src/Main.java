import controller.ClienteController;
import controller.ContaController;
import model.Cliente;
import model.Conta;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setId(660);
        c1.setNome("Antonio");
        c1.setEmail("antonioserra@gmail.com");
        c1.setCpfCnpj("123.456.789.12");

        Cliente c2 = new Cliente();
        c2.setId(660);
        c2.setNome("Lucas");
        c2.setEmail("Lucas@gmail.com");
        c2.setCpfCnpj("399.356.698.22");

        Conta c3 = new Conta();
        c3.setNome("Rocha");
        c3.setEmail("Rocha@gmail.com");
        c3.setSenha(1543);
        c3.setCpfCnpj("250.635.892.30");
        c3.setAgencia("256956.20");
        c3.setNumeroConta("890");

        ContaController contaController = new ContaController();
        contaController.create(c3);
        contaController.readAll().forEach(conta -> {
            System.out.println(conta.toString());
        });

    }
}