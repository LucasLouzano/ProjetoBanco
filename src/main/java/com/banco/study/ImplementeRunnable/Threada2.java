package com.banco.study.ImplementeRunnable;

public class Threada2 {
    public static void main(String[] args) {
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        t1.start();
        t2.start();
        t3.start();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {  // while -> enquanto a t1.t2.t3 Alive -> de estiver viva
            // for (int i = 0; i <15; i++){
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Programa finalizado");
    }
}

