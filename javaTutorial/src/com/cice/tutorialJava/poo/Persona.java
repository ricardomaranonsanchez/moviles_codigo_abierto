package com.cice.tutorialJava.poo;

/*Esta será la primera clase que vamos a crear durante el curso,
 * no es absolutamente necesario que tenga un main, pero se lo he puesto porqueme aburro.*/

public class Persona{

	// un miembro de la clase es un atributo o un método.

	// primeramente se inicializan las variables propias de la clase

	private String nombre;
	private int edad;
	private String domicilio;

	// ahora el constructor de la clase, que es un método que sólo se puede invocar acompañado de New para generar un objeto de una clase
	//Define la manera en la que un objeto se inicializa, todas las clases pueden tener varios objetos. No tiene tipo, y se tiene que 
	//llamar igual que la clase a la que construye.
	
	//aquí tenemos el primer constructor, al que no se le pasan parámetros
	public Persona()
	{
		nombre = "Desconocido";
		edad= 0;
		domicilio = "Desconocido";
	}
	
	//ahora vamos a crear un constructor al que se le pasa el nombre y la edad
	
	public Persona (String nombre, int edad)
	{
		this.nombre = nombre;
		setEdad(edad);
		domicilio = "Desconocido";
		
	}

	// métodos Get / Set para los atributos de la clase

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad>=0&edad<100)
		this.edad = edad;
		else
			System.out.println("Edad no admitida [0/100]");
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	// métodos propios de la clase
	
	public void print()
	{
		System.out.println("Persona\n [Nombre : " + nombre + "]\n [Domicilio : " + domicilio + "]\n [Edad : "+ edad +" ]");	
	}

	

}// cierre de la clase
