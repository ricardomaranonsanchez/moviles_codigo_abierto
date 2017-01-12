package com.cice.tutorialJava.poo.interfaces;

public class Clasificador {
	public static void sort(Comparable[] list)
	{
		//método para ordenar una lista de objetos comparables
	}
	
	public static Object getMinimum (Comparable[] list) throws ComparationException 
	{
		int min = 0;
		
		for (int i=1; i<list.length; i++)
		{
			
			if (list[min].compareTo(list[i])>0)
				min=i;
		}
		return list[min];
		//método para obtener el más pequeño de unalista comparable
			}


}
