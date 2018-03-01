package com.domain.sabadell;

public class Vehiculo {

	private String tipo;
	
	private String marca;
	
	private String volante;
	
	private int idVehiculo;
	
	private static int contador;

	public Vehiculo(String tipo, String marca, String volante) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.volante = volante;
		this.idVehiculo = ++contador;
	}
	
	//Metodo para mostrar vehículo
	public void mostrarVehiculo() {
		System.out.println("Vehículo #" + idVehiculo);
		System.out.println("El tipo es: " + tipo);
		System.out.println("La marca es: " + marca);
		System.out.println("El volante es: " + volante);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}
	
	
	
	
	
}
