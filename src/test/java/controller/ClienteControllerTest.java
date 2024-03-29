package controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.banco.config.ClienteConfig;
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
    public void createClienteSemCpfTest() throws CpfCnpjException {
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
    public void testListarClientes() {
        ClienteController controller = new ClienteController();

        Cliente cliente = new Cliente();
        LocalDate dataNascimento = LocalDate.of(1992, Month.JUNE, 8);
        cliente.setNome("Louzano");
        cliente.setEmail("louzano@gmail.com");
        cliente.setNascimento(dataNascimento);
        cliente.setCpfCnpj("83992558282");

        String nomeRetornado = cliente.getNome();
        String cpfCnpjRetorna = cliente.getCpfCnpj();

        assertEquals("Louzano", nomeRetornado);
        assertEquals("83992558282",  cpfCnpjRetorna);
    }
    @Test
    public void testListarClientesComCPF() {
        ClienteController controller = new ClienteController();
        Cliente cliente = new Cliente();
        LocalDate dataNascimento = LocalDate.of(1992, Month.JUNE, 8);
        cliente.setNome("Louzano");
        cliente.setEmail("louzano@gmail.com");
        cliente.setNascimento(dataNascimento);
        cliente.setCpfCnpj("83992558282");

        List<Cliente> clientesEncontrados = controller.listarClientes("83992558282");
        assertNotNull(clientesEncontrados);
    }


    @Test(expected = RuntimeException.class)
    public void createClienteNomeInvalido() throws CpfCnpjException {
        ClienteController controller = new ClienteController();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        Cliente cliente = new Cliente();
        cliente.setNome("Luc");
        cliente.setEmail("lucas@gmail.com");
        cliente.setNascimento(dataNascimento);
        cliente.setCpfCnpj("12345678978");
        controller.create(cliente);
    }

    @Test
    public void testAdicionarClienteReadAll() {
        ClienteController controller = new ClienteController();
        Cliente cliente = new Cliente();
        LocalDate daNascimento = LocalDate.of(1987, Month.JUNE, 8);
        cliente.setId(1234);
        cliente.setNome("Teste");
        cliente.setEmail("teste@gmail.com");
        cliente.setNascimento(daNascimento);
        cliente.setCpfCnpj("22345678978");
        List<Cliente> clientes = controller.readAll();
        assertNotNull(clientes);
        System.out.println("contas com cpf informado");
    }

    @Test
    public void testUpdateCliente() throws CpfCnpjException {
        ClienteController controller = new ClienteController();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        Cliente cliente = new Cliente();
        cliente.setId(123);
        cliente.setNome("Lucas");
        cliente.setEmail("lucas@gmail.com");
        cliente.setNascimento(dataNascimento);
        cliente.setCpfCnpj("12345678978");

        controller.create(cliente);
        cliente.setEmail("lucas_louzano@gmail.com");


        boolean clienteAtualizado = controller.update("12345678978", cliente);
        if (clienteAtualizado) {

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
    public void testdelete() throws CpfCnpjException {
        ClienteController controller = new ClienteController();
        LocalDate taNascimento = LocalDate.of(1992, Month.JUNE, 8);
        Cliente cliente = new Cliente();
        cliente.setNome("Teste");
        cliente.setEmail("teste@gmail.com");
        cliente.setNascimento(taNascimento);
        cliente.setCpfCnpj("22345678978");
        controller.create(cliente);

        boolean excluiu = controller.delete("22345678978");
        if (excluiu) {
            System.out.println("Exclusão bem sucedida");
        } else {
            System.out.println("O cpf não foi encontrado, ou a exclusão falhou.");
        }
    }
}
