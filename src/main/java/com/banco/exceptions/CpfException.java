package com.banco.exceptions;
public class CpfException extends Exception {
    private static final String msg = "Cpf Invalido";
    private static final long serialVersionUID = 1L;
    public CpfException(){
        super(msg);
    }
    public CpfException(String mensagem){
        super(mensagem);

    }

}
