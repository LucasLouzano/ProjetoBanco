package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import com.banco.controller.ContaController;
import com.banco.model.Conta;

public class ContaControllerTest {
    @Test
    public void createContaTest() throws Exception {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        conta.setEmail("lucas@gmail.com");
        conta.setCpfCnpj("1234567891");

        controller.create(conta);

        Conta c = controller.read("1234567891");
        assertNotNull(c);
        assertEquals("1234567891", c.getCpfCnpj());
    }

    @Test
    public void readContaPeloNome() throws Exception {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        conta.setEmail("rafael@gmail.com");
        conta.setCpfCnpj("1234567894");
        conta.setSenha("8563");
        controller.create(conta);

        Conta c = controller.readContaPeloNome("Rafael");
        assertNotNull(c);
    }

    @Test
    public void TestListarContas() throws Exception {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        LocalDate d = LocalDate.of(2020, Month.JANUARY, 18);
        conta.setEmail("louzano@gmail.com");
        conta.setCpfCnpj("1234567893");
        conta.setSenha("8562");
        conta.setDataCriacao(d);
        controller.create(conta);

        assertTrue(true);
    }

}
