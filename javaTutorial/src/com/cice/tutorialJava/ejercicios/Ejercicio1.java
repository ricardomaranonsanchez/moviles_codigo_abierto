package com.cice.tutorialJava.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		String cadenaMax="";
		String[] miStringArray={"lunes","martes","miercoles","jueves","viernes","sabado","domingo","pascua","reyes","nochebuena"};
		for(String x:miStringArray){
			if(x.length()>cadenaMax.length()){
				cadenaMax=x;
			}
			
		}
		System.out.println(cadenaMax + " tamano: " + cadenaMax.length());
	}

}
	