package com.cice.tutorialJava.poo;

public class Estudiante extends Persona {

	private String nie;
	private String[] cursos;

	public Estudiante(String nombre, int edad, String nie, String... cursos) {
		// 'super' hace referencia al objeto de la super clase, le envía dos
		// parámetros para que cree la persona.
		// es una llamada al constructor de la superclase
		// llamar al constructor de la súperclase es lo primero que se debe
		// hacer, si la superclase tiene un constructor
		// sin paso de parámetros, da igual, lo puedes obviar.
		super(nombre, edad);
		// Seguidamente, se inicializan las variables propias de la clase.
		this.nie = nie;
		this.cursos = cursos;
	}

	public void print() {
		System.out.println("Alumno\n [Nombre : " + super.getNombre() + "]\n [Edad : " + super.getEdad()
				+ "]\n [Domicilio : " + super.getDomicilio() + "]\n [Nie: " + getNie() + "]\n [Nº de Cursos : "
				+ getNumeroDeCursos() + "]");

	}

	// get set de nie
	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}
	// saber el número de cursos a los que el alumno está apuntado

	public int getNumeroDeCursos() {
		return cursos.length;
	}

	// método para añadir cursos utilizando las denominadas 'colecciones'
	public void addCurso(String curso) {
		String[] copia = cursos;
		cursos = new String[cursos.length + 1];
		int i = 0;
		for (i = 0; i < copia.length; i++) {
			cursos[i] = copia[i];
		}
		cursos[i] = curso;
	}
/**
 * Elimina el parámetro curso de la matriz cursos, ajustando su
 * tamaño.
 * @param cursoABorrar, representa el curso que se quiere eliminar.
 */
	public void borraCurso(String cursoABorrar) {
		String[] newCursos = cursos.length>0?
				new String[cursos.length-1]:null;
		if (newCursos == null) return;
		
		for(int i = 0 ; i<cursos.length;i++)
		{
			if(cursos[i].equalsIgnoreCase(cursoABorrar))
			{
				for (int j=i+1;j<cursos.length;j++)
				{
					newCursos[j-1]=cursos[j];
				}
				cursos=newCursos;
				return;
			}
			else
			{
				newCursos[i]=cursos[i];
			}
		}
			
		
			}//cierre del método
	
	//método para mostrar todos los cursos
	public void printCursos()
	{
		for (int i= 0 ; i < cursos.length ; i++)
			System.out.println(cursos[i]+ "\n");
		
	}// cierre del metodo

}
