package com.curso.sabadell;

import java.util.Date;

public class Tarjeta {
	
	//Atributos de la clase
	private int pin;
	
	private double numero;
	
	private String tipo;
	
	private Date fecha;
	
	private int idTarjeta;
	
	private static int contadorTarjeta;

	public int getPin() {
		return pin;
	}
	
	//CONSTRCUTOR 4 argumentos
	public Tarjeta(int pin, double numero, String tipo, Date fecha) {
		super();
		this.idTarjeta = ++contadorTarjeta; //incremento del ID
		this.pin = pin;
		this.numero = numero;
		this.tipo = tipo;
		this.fecha = fecha;
	}
	
	//METODO mostrar tarjeta
	public void mostrarTarjeta() {
		System.out.println("TARJETA #" + idTarjeta);
		System.out.println("el pin es: " + pin);
		System.out.println("el numero es: " + numero);
		System.out.println("el tipo es: " + tipo);
		System.out.println("el fecha es: " + fecha);
	}
	
	//GETTERS Y SETTERS
	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	@Override
	public String toString() {
		return "Tarjeta [pin=" + pin + ", numero=" + numero + ", tipo=" + tipo + ", fecha=" + fecha + ", idTarjeta="
				+ idTarjeta + ", contadorTarjeta=" + contadorTarjeta + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numero);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	//EQUALS para el objeto tarjeta
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		if (Double.doubleToLongBits(numero) != Double.doubleToLongBits(other.numero))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	

}
