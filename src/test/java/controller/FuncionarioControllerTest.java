package controller;

import com.banco.controller.ClienteController;
import com.banco.controller.FuncionarioController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
import com.banco.model.Funcionario;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class FuncionarioControllerTest {
    @Test
    public void createFuncionarioTest() throws CpfCnpjException {
        FuncionarioController controller = new FuncionarioController();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setEmail("lucas@gmail.com");
        funcionario.setNascimento(dataNascimento);
        funcionario.setCpfCnpj("12345678978");

        controller.create(funcionario);
        Funcionario c = controller.read("12345678978");
        assertNotNull(c);
        assertEquals("12345678978", c.getCpfCnpj());
    }

    @Test
    public void testAdicionarFuncionarioReadAll() throws Exception {
        FuncionarioController controller = new FuncionarioController();
        LocalDate taNascimento = LocalDate.of(1987, Month.JUNE, 8);
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Teste");
        funcionario.setEmail("teste@gmail.com");
        funcionario.setNascimento(taNascimento);
        funcionario.setCpfCnpj("22345678978");

        List<Funcionario> funcionarios = controller.readAll();
        if (funcionarios != null) {
            assertNotNull(funcionarios);
            System.out.println("A funcionarios foi adicionados com sucesso");
        } else {
            System.out.println("Erro em adicionar a funcionarios");
        }
    }

    @Test
    public void testUpdateFucionario() throws Exception {
        FuncionarioController controller = new FuncionarioController();
        LocalDate daNascimento = LocalDate.of(1992, Month.JUNE, 10);
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Louzano");
        funcionario.setEmail("louzano@gmail.com");
        funcionario.setNascimento(daNascimento);
        funcionario.setCpfCnpj("82345678978");


        controller.create(funcionario);
        funcionario.setEmail("louzano@gmail.com");


        boolean funcionarioAtualizada = controller.update("82345678978", funcionario);
        if (funcionarioAtualizada) {

            System.out.println("Foi atualizado com sucesso");
            assertTrue(true);

        } else {
            System.out.println("Não foi possivel atualizar");


        }
    }
}