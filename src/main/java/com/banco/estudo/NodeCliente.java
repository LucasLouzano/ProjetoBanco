package com.banco.estudo;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import com.banco.model.Cliente;

public class NodeCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        cliente1.setNome("Lucas");
        cliente1.setEmail("lucas@gmail.com");
        cliente1.setNascimento(dataNascimento);
        cliente1.setCpfCnpj("12345678978");

        Cliente cliente2 = new Cliente();
        LocalDate Nascimento = LocalDate.of(1995, Month.JUNE, 8);
        cliente2.setNome("Antonio");
        cliente2.setEmail("antonio@gmail.com");
        cliente2.setNascimento(Nascimento);
        cliente2.setCpfCnpj("42345678978");

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
        cliente4.setCpfCnpj("22345678978");

        Node<Cliente> n4 = new Node<>(cliente1);
        Node<Cliente> n1 = new Node<>(cliente2);
        Node<Cliente> n2 = new Node<>(cliente3);
        Node<Cliente> n3 = new Node<>(cliente4);
        n1.setNextNode(n4);
        n2.setNextNode(n1);
        n3.setNextNode(n2);

        Node<Cliente> n = n3;

        while (true) {
            System.out.println(n.getValue().getNome());
            n = n.getNextNode();
            if (n == null) {
                break;
            }
        }
    }
}
