package com.cice.tutorialJava.poo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

import com.cice.tutorialJava.poo.interfaces.Racional;

public class SetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myStringSet = new HashSet<>();
		Set<Racional> myRacionalSet = new HashSet<>();
		myStringSet.add("Luís");
		myStringSet.add("Luís");
		myStringSet.add("Manuel");
		myStringSet.add("Jose");
		myStringSet.add("Alberto");
		myStringSet.add("Ricardo");
		myStringSet.add("Pedro");
		System.out.println("Iniciando prueba con strings:");
		System.out.println("Recorriendo el Set con un for each.");		//recorremos la lista con un for each 
		for (String a:myStringSet)
		{System.out.println(a);}
		
		//ahora lo recorremos con uniterador
		System.out.println("Recorriendo el Set con un iterador.");		
		Iterator<String> it = myStringSet.iterator();
		while (it.hasNext())
		{System.out.println(it.next());}
		System.out.println("Iniciando prueba con Racionales:");
		
		System.out.println("Iniciando prueba con Racionales:");
		myRacionalSet.add(new Racional (2,3));
		myRacionalSet.add(new Racional (1,3));
		myRacionalSet.add(new Racional (2,7));
		myRacionalSet.add(new Racional (9,3));
		myRacionalSet.add(new Racional (2,3));
		myRacionalSet.add(new Racional (2,3));
		myRacionalSet.add(new Racional (4,6));
		System.out.println("Recorriendo la lista con un iterador.");		
		Iterator<Racional> it2 = myRacionalSet.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next());}
	}//cierre del while
		
	}// cierre de la clase

