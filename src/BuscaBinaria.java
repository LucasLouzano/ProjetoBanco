

import java.util.Arrays;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] array = {1,8,34,67,9,6,78,12,56,41,90};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int binarySearch(int[] array,int valor){
        int menor = 0;
        int maior =  array.length - 1;
        while (menor <= maior) {
            int media = (maior + menor) / 2;
            int valorMeio = array[media];
            if(valorMeio < valor)
                menor = media + 1;
            else if (valorMeio > valor)
                maior = media - 1;
            else
                return media;
        }
        return -1 ;
    }
}

