package estudo;

public class BubleSort {

    public static void main(String[] args) {

        // nosso vetor
        int[] vet = { 8, 9, 3, 5, 1 };
        // variavel auxiliar que vai ajudar na troca de posicoes
        int aux = 0;

        System.out.println("Vetor desordenado: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }
        System.out.println(" ");
        // Algoritmo Buble Sort
        // ============================================================================

        // =================================================================
        // 8 9 3 5 1
        // 0 1 2 3 4
        // I.J, I.J, I.J, I.J, I.J
        // =================================================================
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        // ============================================================================
        System.out.println("Vetor organizado:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(" " + vet[i]);
        }

    }

}
