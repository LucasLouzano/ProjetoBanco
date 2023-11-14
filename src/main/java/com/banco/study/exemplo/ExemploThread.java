package com.banco.study.exemplo;

public class ExemploThread implements Runnable{
    private String nome;
    private int tempo;

    public ExemploThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;

    }

    Thread fazendoCafe = new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("Fazendo Café");
            try {
                Thread.sleep(tempo); // Espere 1 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread preparandoOvos = new Thread(() -> {
        for (int i = 0; i < 5; i++) {
            System.out.println("Preparando ovos");
            try {
                Thread.sleep(tempo);// Espere 0.8 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " Café está pronto");
        }
    });

    @Override
    public void run() {
        try {
        for (int i = 0; i < 5; i++) {
            System.out.println("Fazendo Café");
        }
                Thread.sleep(tempo); // Espere 1 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " Café está pronto");
        }
    }







