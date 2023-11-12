package com.banco.study.teste;

import com.banco.study.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionar(1);
        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);
        lista.adicionar(2);
        System.out.println(lista);
        lista.adicionar(3);
        System.out.println(lista);
        lista.remover();
        System.out.println(lista);

    }
}
