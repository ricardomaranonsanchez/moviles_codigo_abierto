package com.cice.tutorialJava;

public class TiposPrimitivosTest {

	public static void main(String[] args) {
		int x;
		x=67;
		short s=34;
		float f=56.7f;
		double d=98.7;
		boolean b=true;
		char c='r';
		String str="Angel";
		System.out.println("Valor de x:" + x);

		System.out.println("Valor de c:" + c);
		System.out.println("valor de d: " + d);
		System.out.println("valor de b: " + b);
		System.out.println("valor de str: " + str);
		x=0xff56;		
		System.out.println("Valor de x:" + x);
		x=0b1101;
		System.out.println("Valor de x:" + x);
		c='\t';
		System.out.println("Valor de c:" + c + "Tachan...");
		System.out.println("\\nluis");

	}

}
