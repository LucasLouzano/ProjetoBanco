package com.banco.study.exemplo;

import com.banco.study.exemplo.ExemploThread;

public class MainThread {
    public static void main(String[] args) {
        ExemploThread thread = new ExemploThread("#1", 100);

        Thread fazendoCafe = new Thread(thread);
        fazendoCafe.start();


    }
}
