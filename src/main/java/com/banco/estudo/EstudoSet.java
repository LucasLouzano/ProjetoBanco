package com.banco.estudo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EstudoSet {
    public static void main(String[] args) {
        List<String> nomesList = new ArrayList<>();
        nomesList.add("Joao");
        nomesList.add("Joao");
        nomesList.add("Joao");
        nomesList.add("Joao");
        nomesList.add("Maria");
        nomesList.add("Maria");
        nomesList.add("Maria");
        nomesList.add("Pedro");
        nomesList.add("Pedro");

        Set<String> nomes = new HashSet<>();
        nomes.addAll(nomesList);
        nomesList.clear();

        nomesList.addAll(nomes);
        Collections.sort(nomesList);

        /*
         * Iterator<String> nomesIterator = nomes.iterator();
         * 
         * while (nomesIterator.hasNext()) {
         * System.out.println(nomesIterator.next());
         * }
         */

        nomesList.forEach(nome -> {
            System.out.println(nome);
        });
    }
}
