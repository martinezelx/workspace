package com.es.everis.beca.restaurante;

import java.util.Arrays;

public class Reserva {

	private int idReserva;

	static int contador;
	
	private int numeromesa;
	
	private Persona[] clientes;
	
	//CONSTRUCTOR
	public Reserva() {
		this.idReserva = ++contador;
	}

	public int getNumeromesa() {
		return numeromesa;
	}

	public void setNumeromesa(int numeromesa) {
		this.numeromesa = numeromesa;
	}

	public int getIdReserva() {
		return idReserva;
	}


	public Persona[] getClientes() {
		return clientes;
	}

	public void setClientes(Persona[] clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", numeromesa=" + numeromesa + ", clientes="
				+ Arrays.toString(clientes) + "]";
	}
	

	
}
