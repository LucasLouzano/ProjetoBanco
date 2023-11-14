package com.banco.study.minha;

public class Teste {
    public static void main(String[] args) {
        MinhaThread thread9 = new MinhaThread("Thread #1",600);
      //  MinhaThread thread10 = new MinhaThread("Thread #1",900);
        Thread t9 = new Thread(thread9);
      //  Thread t10 = new Thread(thread10);
    }
}
