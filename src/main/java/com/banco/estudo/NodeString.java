package com.banco.estudo;

public class NodeString {
    public static void main(String[] args) {

        Node<String> n4 = new Node<>("Antonio");
        Node<String> n1 = new Node<>("Lucas");
        Node<String> n2 = new Node<>("Louzano");
        Node<String> n3 = new Node<>("Serra");
        n1.setNextNode(n4);
        n2.setNextNode(n1);
        n3.setNextNode(n2);

        Node<String> n = n3;

        while (true) {
            System.out.println(n.getValue());
            n = n.getNextNode();
            if (n == null) {
                break;
            }
        }
    }
}
