package com.banco.study.exemplo;

public class MainCodigoBarra {

	public static void main(String[] args) {
		String codigoBarraTilenol = "123456789";
		
		if(codigoBarraTilenol != null)
			codigoBarraTilenol = codigoBarraTilenol.substring(0, 2) + "unico" + codigoBarraTilenol.substring(4, 6);
		
		System.out.println(codigoBarraTilenol);
	}
}
