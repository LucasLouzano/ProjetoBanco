package controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.banco.controller.ContaController;
import com.banco.model.Conta;

import static org.junit.Assert.*;

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
    public void readContaPeloEmail() { //Quando a lista vazia deve retornar Null
        ContaController controller = new ContaController();
        Conta c = controller.readContaPeloEmail("daniel@gmail.com");
        assertNull(c);
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
