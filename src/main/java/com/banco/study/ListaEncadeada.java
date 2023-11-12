package com.banco.study;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adicionar(T valor) {
        No<T> celula = new No<T>(valor);
        if (this.tamanho == 0) {
            // if (inicio == null && ultimo == null) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void remover() {
        for (No<T> atual = this.inicio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setValor(null);
            atual.setProximo(null);
            atual = proximo;
        }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";

        }
        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getValor()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getValor()).append("]");
        return builder.toString();
    }
}
        /*
         *
         *builder.append(atual.getValor()).append(",");
         *while(atual.getProximo() != null){
         *   atual =  atual.getProximo();
         *}
         * builder.append(atual.getValor()).append(",");
         *}
         * return builder.toString();
         *}
         *}
         */
