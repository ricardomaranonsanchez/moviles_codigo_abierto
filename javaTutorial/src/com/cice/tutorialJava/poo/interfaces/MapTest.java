package com.cice.tutorialJava.poo.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//para probar las listas tipo map, es una colección en la que cada elemento de la colección lleva asociada una clave

import com.cice.tutorialJava.poo.Persona;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<tipo de la clave de la colección, tipo de cada elemento de la colección>
		Map<String,Persona> myPersonMap = new  HashMap<>();
		myPersonMap.put("p-8001",new Persona("Richard", 25));
		myPersonMap.put("p-8001",new Persona("Ricardo", 35));
		myPersonMap.put("p-8002",new Persona("Olga", 30));
		myPersonMap.put("p-8003",new Persona("Maria", 35));
		myPersonMap.put("p-8004",new Persona("Amparo", 55));
		myPersonMap.put("p-8005",new Persona("Matilda", 75));
		myPersonMap.put("p-8006",new Persona("Óscar", 50));
		myPersonMap.put("p-8007",new Persona("Guillermo", 15));
	
	System.out.println("Ahora vamos a recorrer el mapa");
	//primeramente hay que tener el conjunto de claves, con el método keyset, que devuelve un set
	Set<String> keys = myPersonMap.keySet();
	//ahora vamos a recorrer el conjunto
	for(String key:keys)
	{Persona p = myPersonMap.get(key);
	p.print();
	}
	
	}
	
	}


