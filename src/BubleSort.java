public class BubleSort {

    public static void main(String[] args) {

        // nosso vetor
        int[] vet = { 8, 9, 3, 5, 1 };
        // variavel auxiliar que vai ajudar na troca de posicoes
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for (i = 0; i < 5; i++) {
            System.out.println(" " + vet[i]);
        }
        System.out.println(" ");

        // Algoritmo Buble Sort
        // ============================================================================
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        // ============================================================================
        System.out.println("Vetor organizado:");
        for (i = 0; i < 5; i++) {
            System.out.println(" " + vet[i]);
        }

    }

}
