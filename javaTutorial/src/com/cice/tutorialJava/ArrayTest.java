package com.cice.tutorialJava;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miArray=new int[10];
		miArray[0]=12;
		miArray[1]=12;
		miArray[2]=12;
		miArray[3]=122;
		miArray[4]=12;
		miArray[5]=142;
		miArray[6]=152;
		miArray[7]=162;
		miArray[8]=2;
		miArray[9]=1;
		//miArray[0]=12;
		for (int i=0;i<miArray.length; i++){
			System.out.println(miArray[i]);
		}
		for(int x:miArray){
			System.out.println(x);
		}
		String[] miStringArray={"lunes","martes","miercoles","jueves"};
		for(String x:miStringArray){
			System.out.println(x + " tamano: " + x.length());
		}
	}

}
