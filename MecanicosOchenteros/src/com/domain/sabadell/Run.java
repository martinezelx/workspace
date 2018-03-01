package com.domain.sabadell;

public class Run {

	public static void main(String[] args) {

		Coche v1 = new Coche("coche", "seat", "volante pelao");
		
		Moto v2 = new Moto("moto", "kymco", "manillar");
		
		Bici v3= new Bici("bici", "kymco", "manillar");
				
		v1.mostrarVehiculo();
		System.out.println("");
		v2.mostrarVehiculo();
		System.out.println("");
		v3.mostrarVehiculo();
		System.out.println("");
	}
	
	

}
