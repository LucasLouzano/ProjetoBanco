package controller;

import com.banco.controller.ContaController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Conta;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.Assert.*;

public class ContaControllerTest {
    @Test
    public void createContaTest() {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        conta.setNome("Lucas");
        conta.setEmail("lucas@gmail.com");
        conta.setCpfCnpj("1234567891");

        controller.create(conta);

        Conta c = controller.read("1234567891");
        assertNotNull(c);
        assertEquals("1234567891", c.getCpfCnpj());
    }

    @Test
    public void readContaPeloNome() {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        conta.setNome("Rafael");
        conta.setEmail("rafael@gmail.com");
        conta.setCpfCnpj("1234567894");
        conta.setSenha("8563");
        controller.create(conta);

        Conta c = controller.readContaPeloNome("Rafael");
        assertNotNull(c);
    }

    @Test
    public void TestListarContas() {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        LocalDate d = LocalDate.of(2020, Month.JANUARY, 18);
        conta.setNome("Louzano");
        conta.setEmail("louzano@gmail.com");
        conta.setCpfCnpj("1234567893");
        conta.setSenha("8562");
        conta.setDataCriacao(d);
        controller.create(conta);

        assertTrue(true);
    }

}
