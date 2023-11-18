package controller;

import com.banco.controller.ContaController;
import com.banco.exceptions.CpfException;
import com.banco.model.Conta;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ContaControllerTest {
    @Test
    public void crateContaTest() throws CpfException {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        conta.setNome("Lucas");
        conta.setEmail("lucas@gmail.com");
        conta.setDataNascimento(new Date(90));
        conta.setCpfCnpj("12345678978");

        controller.create(conta);

        Conta c = controller.read("12345678978");
        assertNotNull(c);
        assertEquals("12345678978", c.getCpfCnpj());
    }


    @Test
    public void readContaNaoExistente(){
        ContaController controller = new ContaController();
        Conta c = controller.read("42345678978");
        assertNotNull(c);

        }
        @Test
        public void createConta()throws Exception{
        ContaController controller = new ContaController();
            Conta conta = new Conta();
            conta.setNome("Teste");
            conta.setEmail("teste@gmail.com");
            conta.setDataNascimento(new Date(87));
            conta.setCpfCnpj("22345678978");

            controller.create(conta);
            Conta l = controller.creteConta("Teste");
            assertNotNull(l);

    }

}
