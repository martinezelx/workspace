package com.domain.sabadell;

public class Ruedas {

	private double altura;
	
	private double anchura;
	
	private double pulgadas;
	
	private double marca;

	public Ruedas(double altura, double anchura, double pulgadas, double marca) {
		super();
		this.altura = altura;
		this.anchura = anchura;
		this.pulgadas = pulgadas;
		this.marca = marca;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getMarca() {
		return marca;
	}

	public void setMarca(double marca) {
		this.marca = marca;
	}
	
	
}
