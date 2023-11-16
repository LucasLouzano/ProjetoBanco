package controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.Test;

import com.banco.controller.ClienteController;
import com.banco.model.Cliente;

public class ClienteControllerTest {

	@Test
	public void createClienteTest() {
		ClienteController controller = new ClienteController();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setEmail("lucas@gmail.com");
		cliente.setNascimento(new Date(90));
		cliente.setCpfCnpj("12345678978");
        
        controller.create(cliente);
        
        Cliente c = controller.read("12345678978");
        assertNotNull(c);
	}
	
	@Test
	public void readClienteNaoExiste() {
		ClienteController controller = new ClienteController();
        Cliente c = controller.read("12345678970");
        assertNull(c);
	}
	
	@Test
	public void readClientePeloNome() {
		ClienteController controller = new ClienteController();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Antonio");
		cliente.setEmail("lucas@gmail.com");
		cliente.setNascimento(new Date(90));
		cliente.setCpfCnpj("12345678123");
        
        controller.create(cliente);

        Cliente c = controller.readClientePeloNome("Antonio");
        assertNotNull(c);
	}
	
	
}
