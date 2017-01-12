package com.cice.tutorialJava.poo.collections;

import java.io.FileNotFoundException;

public class DiccionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		Diccionario d = new Diccionario("palabras.txt");
		d.print();
	}catch(FileNotFoundException a)
	{
		a.printStackTrace();
	}
	
	}

}
