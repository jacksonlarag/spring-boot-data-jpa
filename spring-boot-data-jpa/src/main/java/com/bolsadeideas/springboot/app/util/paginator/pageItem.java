package com.bolsadeideas.springboot.app.util.paginator;

public class pageItem {
	private int numero;
	private boolean actual;
	
	public pageItem(int numero, boolean actual) {
		this.numero = numero;
		this.actual = actual;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isActual() {
		return actual;
	}
	
	
	

}
