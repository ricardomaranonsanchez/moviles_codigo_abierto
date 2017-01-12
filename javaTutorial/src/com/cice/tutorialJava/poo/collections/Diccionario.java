package com.cice.tutorialJava.poo.collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Diccionario {

	//hay que cargar las palabras de un archivo, en un mapa.

	Map<Character, List<String>> buffer;
	
	public Diccionario(String file) throws FileNotFoundException
	{
		buffer = new HashMap<>();
		FileInputStream in = new FileInputStream(file);
		Scanner sc= new Scanner(in);
		load(sc);
		
		
	}
	
	private void load(Scanner sc)
	{
		while (sc.hasNext())
		{
			String line = sc.nextLine();
			//guardar la línea leida en el buffer
			
			char c= line.charAt(0);
			List<String> l = buffer.get(c);
			if (l==null)
		{
				l=new ArrayList<>();
				buffer.put(c, l);
		}
			l.add(line);
		}
		//este es el método de la carga del diccionario
	}
	
	//método para imprimir el diccionario
	
	public void print()
	{
		//primeramente vamos a recorrer el mapa obteniendo el conjunto de claves
		Set<Character> keys=  buffer.keySet();
		for (Character c : keys)
		{
			List<String> values= buffer.get(c);
			System.out.print(c +  "[");
			for (String word:values)
			{System.out.println(word + " ");}
			System.out.println("]");
		}
		
	}
	
}
