package com.es.everis.beca.restaurante;

public class Restaurante {
	
	//ARRAY DE MESAS
	public static Mesa[] mesas = new Mesa[20];
	
	//ARRAY DE EMPLEADOS
	public static Empleado[] empleados = new Empleado[5];
	
	//ARRAY DE RESERVAS
	public static Reserva[] reservas = new Reserva[20];
	
	public static void inicializarRestaurante() {
		
		for (int i = 0; i < mesas.length; i++) {		
			mesas[i]=new Mesa();
		}
		
		for (int i = 0; i < reservas.length; i++) {		
			reservas[i]=new Reserva();
		}
		
		for (int i = 0; i < empleados.length; i++) {		
			empleados[i]=new Empleado();
		}
		
		empleados[0] = new Cocinero();
		empleados[1] = new Cocinero();
		empleados[2] = new Empleado();
		empleados[3] = new Empleado();
		empleados[4] = new Empleado();
		
		
	}

}
