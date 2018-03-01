package com.curso.herencia;

import com.curso.sabadell.Tarjeta;

public class Persona {

	//Atributos
	private String nombre;
	private String apellido;
	protected Tarjeta tarjeta;
	
	//Constructor vacío
	public Persona() {
		
	}
	
	//Constructor completo
	public Persona(String nombre, String apellido, Tarjeta tarjeta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
	}

	//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	//metodo pagar
	public void pagar() {
		
		System.out.println("estoy pagando con la tarjeta: " + tarjeta.getNumero());
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", tarjeta=" + tarjeta + "]";
	}
	
	
	
}
