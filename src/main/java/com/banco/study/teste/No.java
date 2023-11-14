package com.banco.study.teste;

public class No<T> {
    private T valor;
    private No<T> proximo;

    public No(T valor) {
        this.valor = valor;
        this.proximo = null;
    }

//    public No(T elemento, No<T> proximo) {
    //       this.elemento = elemento;
    //     this.proximo = proximo;
    //}

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return " No " + " valor = " + valor + ", proximo = " + proximo + '}';
    }
}