package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.Test;

import com.banco.controller.ClienteController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;

public class ClienteControllerTest {

	@Test
	public void createClienteTest() throws CpfCnpjException {
		ClienteController controller = new ClienteController();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setEmail("lucas@gmail.com");
		cliente.setNascimento(new Date(90));
		cliente.setCpfCnpj("12345678978");
        
        controller.create(cliente);
        
        Cliente c = controller.read("12345678978");
        assertNotNull(c);
        assertEquals("12345678978", c.getCpfCnpj());
	}
	
	@Test
	public void readClienteNaoExiste() {
		ClienteController controller = new ClienteController();
        Cliente c = controller.read("12345678970");
        assertNull(c);
	}
	
	@Test
	public void readClientePeloNome() throws Exception{
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
	@Test
	public void readClientepeloCpf()throws Exception{
		ClienteController controller = new ClienteController();

		Cliente cliente = new Cliente();
		cliente.setNome("Louzano");
		cliente.setEmail("louzano@gmail.com");
		cliente.setNascimento(new Date(92));
		cliente.setCpfCnpj("83992558282");

		controller.create(cliente);

		Cliente l = controller.read("83992558282");
		assertNotNull(l);
		assertEquals("83992558282", l.getCpfCnpj());

	}
	
}
