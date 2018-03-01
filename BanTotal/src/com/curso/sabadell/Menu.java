package com.curso.sabadell;

import java.util.Calendar;

import com.curso.herencia.Persona;

public class Menu {
	
	public static void main(String[] args) {
		
		
		Tarjeta t1 = new Tarjeta(1234, 2325432523.0, "sabadell", Calendar.getInstance().getTime());		
		Tarjeta t2 = new Tarjeta(1432, 2345624652.0, "santander", Calendar.getInstance().getTime());		
		Tarjeta t3 = new Tarjeta(1235, 2465462456.0, "cajamurcia", Calendar.getInstance().getTime());
		
	    t1.mostrarTarjeta();
	    System.out.println("");
	    t2.mostrarTarjeta();
	    System.out.println("");
	    t3.mostrarTarjeta();
	    System.out.println("");

	    //persona
	    Persona p1 = new Persona("luis","martinez",t1);	    
	    System.out.println(p1);
	    System.out.println("");
	    
	    //arrays
	    int[] numeros = new int[9]; //10 valores a 0
	    
	    Persona[] personas = new Persona[10]; //11 valores a null
	    		
	    System.out.println(numeros);
	    System.out.println("");
	    
	    //EQUALS
	    
	    String campo1="campo1"; //posicion 38
	    String campo2="campo1"; //posicion 38   
	    String campo3= new String("campo1"); //posicion 48
	    
	    Tarjeta t4 = new Tarjeta(1234, 2325432523.0, "caixa", Calendar.getInstance().getTime());
	    Tarjeta t5 = new Tarjeta(1234, 2325432523.0, "caixa", Calendar.getInstance().getTime());
	    //las tajetas tiene los mismos datos pero se guardan en diferentes bloques de memoria
	    
	    System.out.println("--------------------------------------");
	    
	    if (t4.equals(t5)) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}
	    
	}
	
	void imprimir(String cadena) {
		
	}

}