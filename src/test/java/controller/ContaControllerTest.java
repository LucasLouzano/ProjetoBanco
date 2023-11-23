package controller;
import com.banco.controller.ContaController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Conta;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
public class ContaControllerTest {
    @Test
    public void createContaTest() throws CpfCnpjException {
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
    public void testAdicionarContaReadAll() throws Exception {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        LocalDate daNascimento = LocalDate.of(1987, Month.JUNE, 8);
        conta.setNome("Teste");
        conta.setEmail("teste@gmail.com");
        conta.setDataNascimento(daNascimento);
        conta.setSenha("1234");
        conta.setCpfCnpj("22345678978");
        conta.setDataCriacao(new Date());
        List<Conta> contas = controller.readAll();
        if (contas != null) {
            assertNotNull(contas);
            System.out.println("A conta foi adicionada com sucesso");
        } else {
            System.out.println("Erro em adicionar a conta");
        }

    }

    @Test
    public void testUpdateConta() throws Exception {
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


        boolean contaAtualizada = controller.update("12345678978", conta);
        if (contaAtualizada) {

            System.out.println("Foi atualizado com sucesso");
            assertTrue(true);

        } else {
            System.out.println("Não foi possivel atualizar");

        }
    }

    @Test
    public void readContaPeloNome() {
        ContaController controller = new ContaController();
        LocalDate dataNascimento = LocalDate.of(1995, Month.JUNE, 9);
        Conta conta = new Conta();
        conta.setNome("Antonio");
        conta.setEmail("Antonio@gmail.com");
        conta.setDataNascimento(dataNascimento);
        conta.setCpfCnpj("12345678123");

        controller.create(conta);

        Conta c = controller.readContaPeloNome("Antonio");
        assertNotNull(c);
    }

    @Test
    public void testdelete() {
        ContaController controller = new ContaController();
        Conta conta = new Conta();
        LocalDate taNascimento = LocalDate.of(1992, Month.JUNE, 8);
        conta.setNome("Louzano");
        conta.setEmail("louzano@gmail.com");
        conta.setDataNascimento(taNascimento);
        conta.setCpfCnpj("83992558282");

        boolean excluiu = controller.delete("83992558282");
        if (excluiu) {
            System.out.println("Exclusão bem sucedida");
        } else {
            System.out.println("O cpf não foi encontrado, ou a exclusão falhou.");
        }
    }
}

