package com.domain.sabadell;

import java.util.Date;

public class Cliente {

	private String Dni;
	private String Name;
	private String Surname;
	private Date Fecnac;
	
	public Cliente(String dni, String name, String surname, Date fecnac) {
		super();
		Dni = dni;
		Name = name;
		Surname = surname;
		Fecnac = fecnac;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public Date getFecnac() {
		return Fecnac;
	}

	public void setFecnac(Date fecnac) {
		Fecnac = fecnac;
	}
	
	
	
	
	
}
