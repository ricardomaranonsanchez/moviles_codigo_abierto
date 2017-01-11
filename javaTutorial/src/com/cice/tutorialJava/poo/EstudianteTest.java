package com.cice.tutorialJava.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e = new Estudiante("Luís", 22, "22222222", "Android", "IOS", "Petanca");
		System.out.println(e.getNumeroDeCursos());
		e.print();
		e.addCurso("Yoga");
		e.print();
		System.out.println("Cursos a los que se ha apuntado: ");
		e.printCursos();
		System.out.println("Añadimos el curso 'danza'");
		e.addCurso("danza");
		System.out.println("************************"); 
		System.out.println("Cursos a los que se ha apuntado: ");
		e.printCursos();
		System.out.println("************************");
		System.out.println("Borramos el curso 'danza'");
		e.borraCurso("danza");
		System.out.println("************************"); 
		System.out.println("Cursos a los que se ha apuntado: ");
		e.printCursos();
		System.out.println("************************"); 
		System.out.println("Añadimos el curso 'Android'");
		e.addCurso("Android");
		System.out.println("************************"); 
		System.out.println("Cursos a los que se ha apuntado: ");
		e.printCursos();
		System.out.println("************************");
		System.out.println("Borramos el curso 'android'");
		e.borraCurso("android");
		System.out.println("************************"); 
		System.out.println("Cursos a los que se ha apuntado: ");
		e.printCursos();
		
	}

}
