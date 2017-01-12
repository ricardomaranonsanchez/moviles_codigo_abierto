/*Implementa a la interfaz comparable, los métodos declarados en ella*/

package com.cice.tutorialJava.poo.interfaces;

public class Racional implements Comparable {
	private int numerador;
	private int denominador;
	
	//este constructor se ha generado automáticamente yendo a source => gnerate constructor, es genial
	
	public Racional(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	@Override
	public int compareTo(Object other)  throws ComparationException{
		if (!(other instanceof Racional)) //si no es un número racional
			throw new ComparationException("El elemento comparado debe ser un objeto de tipo racional.");
		Racional r = (Racional)other; //convierto el elemento recibido, other, a un racional nuevo para poder compararlo
		if (numerador*r.getDenominador()>denominador* r.getNumerador())
		return 1;
		else if(numerador*r.getDenominador()<denominador* r.getNumerador())
			return -1;
		return 0;
			
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
	StringBuffer buffer= new StringBuffer();
	String sg=(numerador>0 && denominador>0) || (numerador>=0&&denominador<0)?"+":"-";
	buffer.append(sg);
	buffer.append(Math.abs(numerador) + "/" + Math.abs(denominador));
	return buffer.toString();
	
	}

	//getters y setters
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Racional))
		return false;	
		Racional r = (Racional)obj; //convierto el elemento recibido, other, a un racional nuevo para poder compararlo
		return (numerador*r.getDenominador()==denominador* r.getNumerador())? true:false;
		
	}

	@Override
	public int hashCode() {
		int result = 17;
		result =  31 *  result + numerador; // 8 bits >> 32-bit
		result = 31 * result + denominador; // 16 bits >> 32-bit
		return result;
	}
	
	

}
