
import controller.ClienteController;
import model.Cliente;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        ClienteController controller = new ClienteController();
        c1.setId(660);
        c1.setNome("Antonio");
        c1.setEmail("antonioserra@gmail.com");
        c1.setCpfCnpj("123.456.789.12");
        c1.setNascimento(new Date(75));
        c1.setData(new Date());
        controller.create(c1);

        Cliente c2 = new Cliente();
        c2.setId(661);
        c2.setNome("Rafael");
        c2.setEmail("Rafaelalves@gmail.com");
        c2.setCpfCnpj("399.356.698.22");
        c2.setNascimento(new Date(75));
        c2.setData(new Date());
        controller.create(c2);

        /*
         * ContaPoupanca c4 = new ContaPoupanca(890,2000,123560.2);
         * c4.depositar(1000);
         * c4.sacar(200);
         * System.out.println(c4);
         *
         *
         *
         * ClienteController controller = new ClienteController();
         * controller.delete(1);
         */
        controller.readAll().forEach(c -> {
            System.out.println(c.getId() + " ---" + c.getNome() + " ---" + c.getEmail() + " ---" + c.getCpfCnpj() + " ---" + c.getData());
        });

        Cliente update = new Cliente();
        update.setId(663);
        update.setNome("lucas");
        update.setEmail("lucas@gmail.com");
        update.setCpfCnpj("12345678912");
        update.setNascimento(new Date(70));
        update.setData(new Date());

        if (controller.update("12345678912", update)) {
            System.out.println("Atualizado com sucesso");
        } else {
            System.out.println("Não foi possível atualizar");
        }
        controller.readAll().forEach(a -> {
            System.out.println(a.getId() + " ---" + a.getNome() + " ---" + a.getEmail() + " ---" + a.getCpfCnpj() + " ---" + a.getData());
        });

        update = new Cliente();
        update.setId(664);
        update.setNome("Douglas");
        update.setEmail("douglas@gmail.com");
        update.setCpfCnpj("39935669822");
        update.setNascimento(new Date(72));
        update.setData(new Date());

        if (controller.update("39935669822", update)) {
            System.out.println("Atualizado com sucesso");
        } else {
            System.out.println("Não foi possível atualizar");
        }
        controller.readAll().forEach(c -> {
            System.out.println(c.getId() + " ---" + c.getNome() + " ---" + c.getEmail() + " ---" + c.getCpfCnpj() + " ---" + c.getData());
        });
    }
}