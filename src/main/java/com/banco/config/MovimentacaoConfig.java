package com.banco.config;

import com.banco.controller.ClienteController;
import com.banco.controller.ContaController;
import com.banco.controller.MovimentacaoController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.Movimentacao;
import com.banco.model.TipoMovimentacao;
import com.banco.repository.impl.MovimentacaoDAOImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;


public class MovimentacaoConfig {

    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        cliente.setNome("Lucas");
        cliente.setEmail("lucas@gmail.com");
        cliente.setSenha("123456");
        cliente.setNascimento(dataNascimento);
        cliente.setCpfCnpj("12345678910");

        ClienteController clienteController = new ClienteController();
        clienteController.create(cliente);

        Conta conta = new Conta();
        LocalDate dta = LocalDate.of(2020, Month.AUGUST, 8);
        conta.setCpfCnpj("12345678910");
        conta.setEmail("lucas@gmail.com");
        conta.setSenha("8560");
        conta.setAgencia("0890-9");
        conta.setNumeroConta("146856");
        conta.setSaldo(1200.50);
        conta.setDataCriacao(dta);

        ContaController contaController = new ContaController();
        contaController.create(conta);


        Movimentacao movi = new Movimentacao();
        String dataString = "01/08/2025 10:30:45";
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = formato.parse(dataString);
        movi.setId(1l);
        movi.setMontante(1548.00);
        movi.setData(data);
        movi.setNumeroConta("146856");
        movi.setTipoMovimentacao(TipoMovimentacao.DEBITO);

        Movimentacao mov = new Movimentacao();
        String dtString = "30/08/2025 07:00:45";
        Date dts = formato.parse(dtString);
        mov.setId(2l);
        mov.setMontante(1556);
        mov.setData(dts);
        mov.setNumeroConta("146856");
        mov.setTipoMovimentacao(TipoMovimentacao.CREDITO);

        Movimentacao mo = new Movimentacao();
        String dataS = "01/09/2025 17:30:45";
        Date da = formato.parse(dataS);
        mo.setId(3l);
        mo.setMontante(1556);
        mo.setData(da);
        mo.setNumeroConta("146856");
        mo.setTipoMovimentacao(TipoMovimentacao.DEBITO);

        Movimentacao m = new Movimentacao();
        String dtStr = "30/09/2025 22:20:45";
        Date d = formato.parse(dtStr);
        m.setId(4l);
        m.setMontante(1557);
        m.setData(d);
        m.setNumeroConta("146856");
        m.setTipoMovimentacao(TipoMovimentacao.CREDITO);

//        MovimentacaoDAOImpl movimentacaoDAO = new MovimentacaoDAOImpl();
//        movimentacaoDAO.create(movi);
//        movimentacaoDAO.create(mov);
//        movimentacaoDAO.create(mo);
//        movimentacaoDAO.create(m);
//
//        System.out.println(" Todas as movimentações:");
//        for (Movimentacao movimentacaoD : movimentacaoDAO.readAll()) {
//            System.out.println(movimentacaoD);
//        }
//
//
//        System.out.println("\n Movimentação ID 2:");
//        Movimentacao movimentacaoEncontradas = movimentacaoDAO.read(2L);
//        System.out.println(movimentacaoEncontradas);
//
//        boolean sucessoUpdates = movimentacaoDAO.update(1L, movi);
//        System.out.println("\n Atualização Id 2: " + (sucessoUpdates ? "Sucesso" : "Falhou"));
//        System.out.println(movimentacaoDAO.read(1L));
//
//
//        boolean sucessoDeletes = movimentacaoDAO.delete(3L);
//        System.out.println("\n Exclusão Id 3: " + (sucessoDeletes ? "Sucesso" : "Falhou"));
//
//
//        System.out.println("\n Movimentações após alterações:");
//        for (Movimentacao movimentacao : movimentacaoDAO.readAll()) {
//            System.out.println(movimentacao);
//        }

        MovimentacaoController controller = new MovimentacaoController();
        controller.create(movi);
        controller.create(mov);
        controller.create(mo);
        controller.create(m);

//        MovimentacaoController controller1 = new MovimentacaoController();

        System.out.println(" Todas as movimentações:");
        for (Movimentacao movimentacao : controller.readAll()) {
            System.out.println(movimentacao);
        }

        System.out.println(" Buscar conta:");
        for (Movimentacao movimentacao : controller.buscar("14685")) {
            System.out.println(movimentacao);
        }


        System.out.println("\n Movimentação ID 2:");
        Movimentacao movimentacaoEncontrada = controller.read(2L);
        System.out.println(movimentacaoEncontrada);

        boolean sucessoUpdate = controller.update(2L, mov);
        System.out.println("\n Atualização Id 2: " + (sucessoUpdate ? "Sucesso" : "Falhou"));
        System.out.println(controller.read(2L));


        boolean sucessoDelete = controller.delete(3L);
        System.out.println("\n Exclusão Id 3: " + (sucessoDelete ? "Sucesso" : "Falhou"));


        System.out.println("\n Movimentações após alterações:");
        for (Movimentacao movimentacao : controller.readAll()) {
            System.out.println(movimentacao);
        }
    }
}
