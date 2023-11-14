package com.banco.study.minha;
public class MinhaThread extends Thread {
    private String nome;
    private int tempo;

    public MinhaThread(String nome,int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    public void run(){
        try {
        for (int i = 0; i<5; i++) {
            System.out.println(nome + "O almoço está pronto" + i);
        }
                Thread.sleep(tempo); // ela vai dormir por alguns segundos sleep
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        System.out.println(nome + "Acabamos de almoçar");
        }
    }
