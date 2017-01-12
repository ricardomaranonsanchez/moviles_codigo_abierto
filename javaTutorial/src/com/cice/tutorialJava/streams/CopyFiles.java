package com.cice.tutorialJava.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

//ejemplo de trabajo con streams

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fs = System.getProperty("file.separator");
		File file = new File("src"+fs+"com"+fs+"cice"+fs+"tutorialjava"+fs+"ArrayTest.Java");
		
		if (file.exists()){
			
			try(InputStream in = new FileInputStream(file);OutputStream out = new FileOutputStream("copy.txt");)
			{
				int bytesleidos= 0;
				byte[] buffer = new byte[1024];
				System.out.println("****** Iniciando la copia ******");
				
				do
				{
					bytesleidos = in.read(buffer);
					if (bytesleidos>0)
					{
						out.write(buffer, 0, bytesleidos);
					}// cierre del if
					
				}while (bytesleidos==buffer.length);
				
				/*while((bytesleidos=in.read())!=-1)
				{
					out.write(bytesleidos);
				}//cierre del while*/
				
				
				System.out.println("****** Copia Terminada ******");
				//si el fichero que crea no existe, lo hace de nuevo
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
				{
					e.printStackTrace();
				}	
			}//cierre del finally	
		}		
	}


