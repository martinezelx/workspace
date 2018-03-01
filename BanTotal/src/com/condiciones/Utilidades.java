package com.condiciones;

public class Utilidades {
	
	public static String dimeSiApruebo(Double nota) {
		
		String calificacion = null;
		
		//IF
		if (nota >= 5) {
			calificacion = "APROVADO";
		} else {
			calificacion = "SUSPENSO";
		}
		
		
		/*
		//SWITCH solo funciona con strings
		switch (nota.toString()) {
		case "1":
			calificacion ="suspenso";
			break;
		case "2.0":
			calificacion ="suspenso";
			break;
		case "3":
			calificacion ="suspenso";
			break;
		case "4":
			calificacion ="suspenso";
			break;
		default:
			calificacion ="aprobado";
		}
		*/

		
		return calificacion; 
		
	}
			
			

}
