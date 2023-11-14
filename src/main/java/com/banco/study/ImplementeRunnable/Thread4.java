package com.banco.study.ImplementeRunnable;

public class Thread4 {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
        Thread th1 = new Thread(thread1);
        Thread th2 = new Thread(thread2);
        Thread th3 = new Thread(thread3);
        th1.setPriority(5); // prioridade para imprimir no console: esse atributo ele pode ter valores de 1 a 10
        th2.setPriority(3);
        th3.setPriority(1);
       // th1.setPriority(Thread.NORM_PRIORITY); // classe setPriority: ele também tem constantes ela tem aprioridade maxima minima e normal
        th1.start();
        th2.start();
        th3.start();
    }
}
