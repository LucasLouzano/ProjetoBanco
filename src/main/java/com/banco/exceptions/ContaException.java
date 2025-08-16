package com.banco.exceptions;

public class ContaException extends Exception{
    private static final String CONTAS  = "Conta não encontrada ";

    private static final long serialVersionUID = 1L;

    public ContaException() {
        super(CONTAS);
    }

    public ContaException(String message) {
        super(message);
    }

    public ContaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContaException(Throwable cause) {
        super(cause);
    }

    public ContaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
