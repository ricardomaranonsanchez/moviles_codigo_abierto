package com.cice.tutorialJava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cice.tutorialJava.poo.interfaces.Racional;

public class ListaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myStringList = new ArrayList<>();
		List<Racional> myRacionalList = new ArrayList<>();
		myStringList.add("Luís");
		myStringList.add("Luís");
		myStringList.add("Manuel");
		myStringList.add("Jose");
		myStringList.add("Alberto");
		myStringList.add("Ricardo");
		myStringList.add("Pedro");
		System.out.println("Iniciando prueba con strings:");
		System.out.println("Recorriendo la lista con un for.");
		for (int i =0; i<myStringList.size();i++)
		{
			System.out.println(myStringList.get(i));
		}
		System.out.println("Recorriendo la lista con un for each.");		//recorremos la lista con un for each 
		for (String a:myStringList)
		{System.out.println(a);}
		
		//ahora lo recorremos con uniterador
		System.out.println("Recorriendo la lista con un iterador.");		
		Iterator<String> it = myStringList.iterator();
		while (it.hasNext())
		{System.out.println(it.next());}
		System.out.println("Iniciando prueba con Racionales:");
		myRacionalList.add(new Racional (2,3));
		myRacionalList.add(new Racional (1,3));
		myRacionalList.add(new Racional (2,7));
		myRacionalList.add(new Racional (9,3));
		myRacionalList.add(new Racional (2,3));
		myRacionalList.add(new Racional (2,3));
		myRacionalList.add(new Racional (4,6));
		System.out.println("Recorriendo la lista con un iterador.");		
		Iterator<Racional> it2 = myRacionalList.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next());}
	}//cierre del while

		
	}


