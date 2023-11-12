package com.banco.estudo;

import java.util.Date;

import com.banco.model.Cliente;

public class NodeCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Lucas");
        cliente1.setEmail("lucas@gmail.com");
        cliente1.setNascimento(new Date(90));
        cliente1.setCpfCnpj("12345678978");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Antonio");
        cliente2.setEmail("antonio@gmail.com");
        cliente2.setNascimento(new Date(95));
        cliente2.setCpfCnpj("42345678978");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Louzano");
        cliente3.setEmail("louzano@gmail.com");
        cliente3.setNascimento(new Date(92));
        cliente3.setCpfCnpj("83992558282");

        Cliente cliente4 = new Cliente();
        cliente4.setNome("Teste");
        cliente4.setEmail("teste@gmail.com");
        cliente4.setNascimento(new Date(89));
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
