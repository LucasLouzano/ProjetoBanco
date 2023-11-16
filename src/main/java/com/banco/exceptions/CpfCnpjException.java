package com.banco.exceptions;

public class CpfCnpjException extends Exception {
	
	private static final String MSG = "CPF INVÁLIDO"; 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CpfCnpjException() {
		super(MSG);
    }

    public CpfCnpjException(String mensagem) {
        super(mensagem);
    }
	
}
