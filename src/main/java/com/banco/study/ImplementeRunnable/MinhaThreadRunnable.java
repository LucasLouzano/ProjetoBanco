package com.banco.study.ImplementeRunnable;

public class MinhaThreadRunnable implements Runnable {
    private String nome;
    private int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
       // Thread t1 = new Thread(this);
       // t1.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + "Contador " + i);
                Thread.sleep(tempo); // tempo de es pera
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " terminou a execução");
    }
}
