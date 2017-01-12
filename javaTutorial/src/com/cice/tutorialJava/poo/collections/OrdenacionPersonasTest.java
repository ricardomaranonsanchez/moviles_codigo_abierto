package com.cice.tutorialJava.poo.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Comparator;

import com.cice.tutorialJava.poo.Persona;
public class OrdenacionPersonasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primero vamos a crear unalista de objetos persona
		
		List<Persona> list= new ArrayList<>();
		list.add(new Persona("Luis",24));
		list.add(new Persona("Manuel",25));
		list.add(new Persona("Jose",34));
		list.add(new Persona("Juan",28));
		list.add(new Persona("Lucía",29));
		list.add(new Persona("Lucas",29));
		
		//ahora intentar invocar el me´todo de collections que ordena , a ver qué tal
		
		Collections.sort(list, new Comparator<Persona>(){
			
			//implementación anónima del método compare de la interfaz comparator, por eso de implemneta en la declaración
			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getEdad()-o2.getEdad();
			}});
		//al restar 1 - 2, lo que hace es saber cuál es mayor y, por ahí, lo ordena. positivo? el primero . Negativo? el segundo.
			
		//ahora vamos a mostrar la lista, a ver si ha quedado ordenada
		
		for(Persona p: list)
		{p.print();}
				
		

	}

}
