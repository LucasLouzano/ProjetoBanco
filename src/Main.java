
import controller.ClienteController;
import controller.ContaController;
import model.Cliente;
import model.ContaPoupanca;
import model.Funcionario;

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

        ContaPoupanca c4 = new ContaPoupanca(890,2000,123560.2);
        c4.depositar(1000);
        c4.sacar(200);
        System.out.println(c4);



        ClienteController controller = new ClienteController();
        controller.delete(1);
        




    }
}