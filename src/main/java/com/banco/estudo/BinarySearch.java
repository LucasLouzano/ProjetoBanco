package com.banco.estudo;

public class BinarySearch {

    private static int medirPesquisaNormal = 0;
    private static int medirBinarySearch = 0;

    public static void main(String[] args) {
        int[] meuVetor = { 5, 10, 15, 20, 22, 50, 52, 55, 60, 70, 80, 90, 100, 101, 102, 103, 104, 105, 106 };
        int procurado = 103;
        int posicaoProcurado = pesquisaNormal(procurado, meuVetor);
        if (posicaoProcurado == -1) {
            System.out.println("Não encontrado");
        } else {
            System.out.println("Econtrado " + posicaoProcurado);
            System.out.println("Medidor " + medirPesquisaNormal);
        }

        System.out.println("===============================================");

        posicaoProcurado = binarySearch(procurado, meuVetor);
        if (posicaoProcurado == -1) {
            System.out.println("Não encontrado");
        } else {
            System.out.println("Econtrado " + posicaoProcurado);
            System.out.println("Medidor " + medirBinarySearch);
        }

    }

    private static int pesquisaNormal(int procurado, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            medirPesquisaNormal++;
            if (vetor[i] == procurado) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int procurado, int[] vetor) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            medirBinarySearch++;
            // 2 = (0 + 4) / 2
            // 3 = (3 + 4) / 2
            int meio = (esquerda + direita) / 2;

            // vetor[2] (15) == 20
            // vetor[3] (20) == 20
            if (vetor[meio] == procurado) {
                return meio; // Encontrou o número!
                // vetor[2] (15) < 20
            } else if (vetor[meio] < procurado) {
                // esquerda = 2 + 1
                esquerda = meio + 1; // Procurar na metade direita
            } else {
                direita = meio - 1; // Procurar na metade esquerda
            }
        }
        return -1;
    }

}
