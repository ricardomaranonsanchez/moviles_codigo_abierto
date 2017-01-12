package com.cice.tutorialJava.poo.interfaces;

public interface Comparable {
	//para ue una clase pueda considerarse "comparable" ha de tener un método ue se llame "compare to object".
	// el número entero que devuelve debe describir en qué medida es máso menos parecido alobjeto que se compara. 0 es que son iguales
	// menor que cero, es más pequeño y si es mayor que cero es que es mayor.
	
	public int compareTo(Object other) 
			throws  ComparationException;
	
}
