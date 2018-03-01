package com.curso.herencia;

public class Cliente extends Persona{

	private String numeroCuenta;

	public String comprar() {
		
		return "compra....";
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	@Override
	public String toString() {
		return "Cliente [numeroCuenta=" + numeroCuenta + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
