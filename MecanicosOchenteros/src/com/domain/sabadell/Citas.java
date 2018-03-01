package com.domain.sabadell;

import java.util.Date;

public class Citas extends Cliente{

	//Atributos globales
	private Date fechaReserva;
	
	private double tiempoReparacion;
	
	private String desc;
	
	//Constructor completo
	public Citas(String dni, String name, String surname, Date fecnac, Date fechaReserva, double tiempoReparacion, String desc) {
		super(dni, name, surname, fecnac);
		this.fechaReserva = fechaReserva;
		this.tiempoReparacion = tiempoReparacion;
		this.desc = desc;
	}

	
	//GETTERS / SETTERS
	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public double getTiempoReparacion() {
		return tiempoReparacion;
	}

	public void setTiempoReparacion(double tiempoReparacion) {
		this.tiempoReparacion = tiempoReparacion;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	

}
