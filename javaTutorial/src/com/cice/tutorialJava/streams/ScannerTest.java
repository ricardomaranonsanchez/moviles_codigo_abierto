package com.cice.tutorialJava.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {

	public static void main (String[] args)
	{
	try {
		Scanner sc =new Scanner (new FileInputStream("Palabras2.txt"));
//		sc.useDelimiter("\\s*bla\\s*");
		float suma = 0;
		while(sc.hasNext())
		{
			try
			{
				
			float x = sc.nextFloat();
			System.out.println("Número "+ x);
			suma+=x;
			}catch (InputMismatchException e)
			{
				sc.next();
			}
			}
		System.out.println("Suma de todos los números : " + suma);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//implementar el código para que me calcule la suma de todos los números que se han introducido en el archivo
	
	}
}
