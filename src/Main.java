import model.Cliente;

import controller.ClienteController;
import repository.ClienteDAO;
import repository.impl.ClienteDAOImpl;

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


        ClienteController clienteController = new ClienteController();

        clienteController.create(c1);
        clienteController.create(c2);

        clienteController.readAll().forEach(cliente -> {
            System.out.println(cliente.toString());
        });

    }
}
