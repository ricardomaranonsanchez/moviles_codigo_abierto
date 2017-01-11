package com.cice.tutorialJava.poo;

public class PersonaTest {
	
	public static void main(String[] args)
	{
		System.out.println("Construyendo un objeto de tipo persona.");
		Persona p = new Persona("Juan",45);
		System.out.println("Objeto persona construido.");
		p.print();
		p.setEdad(200);
		p.print();
	}

}
