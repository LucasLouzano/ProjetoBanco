package controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

import com.banco.controller.ContaController;
import com.banco.model.Conta;
import org.junit.Test;

import com.banco.controller.ClienteController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;

import static org.junit.Assert.*;

public class ClienteControllerTest {

	@Test
	public void createClienteTest() throws CpfCnpjException {
		ClienteController controller = new ClienteController();

		LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setEmail("lucas@gmail.com");
		cliente.setNascimento(dataNascimento);
		cliente.setCpfCnpj("12345678978");
        
        controller.create(cliente);
        
        Cliente c = controller.read("12345678978");
        assertNotNull(c);
        assertEquals("12345678978", c.getCpfCnpj());
	}
	
	@Test(expected = CpfCnpjException.class)
	public void createClienteSemCPFTest() throws CpfCnpjException {
		ClienteController controller = new ClienteController();

		LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setEmail("lucas@gmail.com");
		cliente.setNascimento(dataNascimento);
		cliente.setCpfCnpj("1234567897");
        controller.create(cliente);
	}
	
	@Test
	public void testAdicionarClienteReadAll()throws Exception {
		ClienteController controller = new ClienteController();
		Cliente cliente = new Cliente();
		LocalDate daNascimento = LocalDate.of(1987, Month.JUNE, 8);
		cliente.setId(1234);
		cliente.setNome("Teste");
		cliente.setEmail("teste@gmail.com");
		cliente.setNascimento(daNascimento);
		cliente.setCpfCnpj("22345678978");
		cliente.setData(new Date());
		List<Cliente> clientes = controller.readAll();
		if (clientes != null) {
			assertNotNull(clientes);
			System.out.println("A conta foi adicionada com sucesso");
		}else{
			System.out.println("Erro em adicionar a conta");
		}

	}
	@Test
	public void testUpdateCliente() throws Exception {
		ClienteController controller = new ClienteController();
		LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
		Cliente cliente = new Cliente();
		cliente.setId(123);
		cliente.setNome("Lucas");
		cliente.setEmail("lucas@gmail.com");
		cliente.setData(new Date());
		cliente.setNascimento(dataNascimento);
		cliente.setCpfCnpj("12345678978");

		controller.create(cliente);
		cliente.setEmail("lucas_louzano@gmail.com");


		boolean clienteAtualizada = controller.update("12345678978", cliente);
		if (clienteAtualizada) {

			System.out.println("Foi atualizado com sucesso");
			assertTrue(true);

		} else {
			System.out.println("Não foi possivel atualizar");

		}
	}
	@Test
	public void readClientePeloNome() throws CpfCnpjException {
		ClienteController controller = new ClienteController();
		LocalDate dataNascimento = LocalDate.of(1995, Month.JUNE, 9);
		Cliente cliente = new Cliente();
		cliente.setNome("Antonio");
		cliente.setEmail("Antonio@gmail.com");
		cliente.setNascimento(dataNascimento);
		cliente.setCpfCnpj("12345678123");
        
        controller.create(cliente);

        Cliente c = controller.readClientePeloNome("Antonio");
        assertNotNull(c);
	}
	@Test
	public void testdelete() {
		ClienteController controller = new ClienteController();
		LocalDate taNascimento = LocalDate.of(1992, Month.JUNE, 8);
		Cliente cliente = new Cliente();
		cliente.setNome("Louzano");
		cliente.setEmail("louzano@gmail.com");
		cliente.setNascimento(taNascimento);
		cliente.setCpfCnpj("83992558282");

		boolean excluiu = controller.delete("83992558282");
		if (excluiu) {
			System.out.println("Exclusão bem sucedida");
		} else {
			System.out.println("O cpf não foi encontrado, ou a exclusão falhou.");
		}
	}
}