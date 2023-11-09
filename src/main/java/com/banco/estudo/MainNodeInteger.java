package com.banco.estudo;

public class MainNodeInteger {
    public static void main(String[] args) {

        Node<Integer> n4 = new Node<>(8);
        Node<Integer> n1 = new Node<>(5);
        Node<Integer> n2 = new Node<>(7);
        Node<Integer> n3 = new Node<>(9);
        n1.setNextNode(n4);
        n2.setNextNode(n1);
        n3.setNextNode(n2);

        Node<Integer> n = n3;

        while (true) {
            System.out.println(n.getValue());
            n = n.getNextNode();
            if (n == null) {
                break;
            }
        }

    }
}
