package com.banco.study.calculadora;

public class Calculadora {
    private int soma;
    public synchronized int somaArray(int[] array){
        soma = 0;
         for (int i = 0; i< array.length; i++){
             soma += array[i];
             System.out.println("Executando a soma " + Thread.currentThread().getName() +  " Somando valor " +
                     array[i] + " com total de " + soma);
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
         return soma;
    }
}
