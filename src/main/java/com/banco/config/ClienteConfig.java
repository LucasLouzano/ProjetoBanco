package com.banco.config;

import java.time.LocalDate;
import java.time.Month;

import com.banco.controller.ClienteController;
import com.banco.exceptions.CpfCnpjException;
import com.banco.model.Cliente;

public class ClienteConfig {
    public static void clienteInit() {

    	try {
		
        Cliente cliente1 = new Cliente();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        cliente1.setNome("Lucas");
        cliente1.setEmail("lucas@gmail.com");
        cliente1.setSenha("123456");
        cliente1.setNascimento(dataNascimento);
        cliente1.setCpfCnpj("12345678910");

        Cliente cliente2 = new Cliente();
        LocalDate Nascimento = LocalDate.of(1995, Month.JUNE, 8);
        cliente2.setNome("Antonio");
        cliente2.setEmail("antonio@gmail.com");
        cliente2.setSenha("456123");
        cliente2.setNascimento(Nascimento);
        cliente2.setCpfCnpj("12345678920");

        Cliente cliente3 = new Cliente();
        LocalDate daNascimento = LocalDate.of(1992, Month.JUNE, 8);
        cliente3.setNome("Louzano");
        cliente3.setEmail("louzano@gmail.com");
        cliente3.setNascimento(daNascimento);
        cliente3.setCpfCnpj("83992558282");

        Cliente cliente4 = new Cliente();
        LocalDate taNascimento = LocalDate.of(1987, Month.JUNE, 8);
        cliente4.setNome("Teste");
        cliente4.setEmail("teste@gmail.com");
        cliente4.setNascimento(taNascimento);
        cliente4.setCpfCnpj("12345678940");

        ClienteController contro = new ClienteController();
        contro.create(cliente2);
        contro.create(cliente1);
        contro.create(cliente4);
        contro.create(cliente3);
    	} catch (CpfCnpjException e) {
    		System.out.println("Um dos cpfs estão inválidos");
		}
    }
    
    public static void main(String[] args) {
    	clienteInit();
	}
}

