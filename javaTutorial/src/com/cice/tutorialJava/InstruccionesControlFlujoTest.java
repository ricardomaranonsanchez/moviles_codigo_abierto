	package com.cice.tutorialJava;
/**
 * comentario que permite generar documentacon
 * @author cice
 *
 */
public class InstruccionesControlFlujoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alternativo simple
		/*
		 * *
		 * */
		int puntuacion=7;
		 if (puntuacion>5){
			 System.out.println("aprobado");
		 }else{
			 System.out.println("suspenso");
			 
		 }
		 
		 switch(puntuacion){
		 case 0:
			 System.out.println("suspendido");
			 break;
		 case 1:
			 System.out.println("suspendido");
			 break;
		 case 2:
			 System.out.println("suspendido");
			 break;
		 case 3:
			 System.out.println("suspendido");
			 break;
		 case 4:
			 System.out.println("suspendido");
			 break;
		 case 5:
			 System.out.println("aprobado");
			 break;
		 case 6:
			 System.out.println("bien");
			 break;
		 case 7:
			 System.out.println("Notable");
			 break;
		 case 8:
			 System.out.println("Notable");
			 break;
		 case 9:
			 System.out.println("Sobresaliente");
			 break;
		 case 10:
			 System.out.println("Matricula");
			 break;
		default:
			System.out.println("No valida");
		 }
		 
		 puntuacion = 0;
		 while (puntuacion<10){
			 System.out.println("incremento..."+puntuacion);
			 puntuacion++;
		 }
		 System.out.println("Puntuacion final: " + puntuacion);
		 
		 for(puntuacion=0; puntuacion<10; puntuacion++){
			 System.out.println("incremento...for: " + puntuacion);
		 }
		 
		 do{
			 puntuacion++;
			 
		 }while(puntuacion<10);
		 System.out.println("Puntuacion final: " + puntuacion);

		 puntuacion=0;
		 while(puntuacion<100){
			 System.out.println("Incremento");
			 puntuacion++;
			 if(puntuacion==10)
				 break;
		 }
		 System.out.println("Puntuacion final: " + puntuacion);
		 puntuacion=0;
		 while(puntuacion<100){
			 System.out.println("Incremento");
			 puntuacion++;
			 if(puntuacion==5)
				 continue;
		 }

		 
	}

}
