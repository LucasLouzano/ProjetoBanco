package controller;

import com.banco.controller.ContaController;
import com.banco.exceptions.CpfException;
import com.banco.model.Conta;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ContaControllerTest {
    @Test
    public void createContaTest() throws CpfException {
        ContaController controller = new ContaController();
        LocalDate dataNascimento = LocalDate.of(1992, Month.JUNE, 8);
        Conta conta = new Conta();
        conta.setNome("Lucas");
        conta.setEmail("lucas@gmail.com");
        conta.setDataNascimento(dataNascimento);
        conta.setCpfCnpj("12345678978");

        controller.create(conta);

        Conta c = controller.read("12345678978");
        assertNotNull(c);
        assertEquals("12345678978", c.getCpfCnpj());
    }

    @Test
    public void testReadAll() {
        ContaController controller = new ContaController();
        List<Conta> contas = controller.readAll();
        assertNotNull(contas);
        assertEquals(2, contas.size());
    }

    @Test
    public void readContaNaoExistente() {
        ContaController controller = new ContaController();
        Conta c = controller.read("12345678970");
        assertNull(c);
    }

    @Test
    public void TestMetodoReadContaInexistente() {
        ContaController controller = new ContaController();
        Conta contaNaoEncontrada = controller.read("83992558282");
        assertNull(contaNaoEncontrada);
    }

    @Test
    public void testUpdateConta() {
        ContaController controller = new ContaController();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        Conta conta = new Conta();
        conta.setNome("Lucas");
        conta.setEmail("lucas@gmail.com");
        conta.setSenha("123");
        conta.setDataCriacao(new Date());
        conta.setDataNascimento(dataNascimento);
        conta.setCpfCnpj("12345678978");

        controller.create(conta);
        conta.setEmail("lucas_louzano@gmail.com");


        boolean contaAtualizada = controller.update("lucas", conta);
        if (contaAtualizada) {
            System.out.println("Foi atualizado com sucesso");
            assertTrue(contaAtualizada);

      } else {
            System.out.println("Não foi possivel atualizar");

        }
    }
}

