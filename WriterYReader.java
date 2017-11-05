package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterYReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lista = "pepe-ramon-ana-luis";
		String[] lista2 = { "pepe", "ramon", "luis", "ana"};
		
		String[] partes = lista.split("-");
		for(int i=0;i<partes.length;i++)
		{
			System.out.println("Estos son tus nombres: " + partes[i]);
		}
		
		
		try {
			File fichero = new File("HolaCaracola.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			for(int i=0; i<lista2.length;i++){
				ficheroEscritura.write(lista2[i]);
				if(i !=(lista.length()-1)){
					ficheroEscritura.write("-");
				}}
				ficheroEscritura.close();				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			File fichero = new File("HolaCaracola.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			BufferedReader buffer = new BufferedReader(ficheroLectura);
			
			String linea;
			
			while((linea=buffer.readLine())!=null)
			{
				System.out.println(linea);
				ficheroLectura.close();
			}	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		 try{
	            //Abro stream, crea el fichero si no existe
	            FileWriter ficheroEscritura2 = new FileWriter("fichero1.txt");
	            //Escribimos en el fichero un String y un caracter 97 (a)
	            ficheroEscritura2.write("Esto es una prueba");
	            ficheroEscritura2.write(97);
	            //Cierro el stream
	            ficheroEscritura2.close(); 
	                //Abro el stream, el fichero debe existir
	            FileReader ficheroLectura2 = new FileReader("fichero1.txt");
	            //Leemos el fichero y lo mostramos por pantalla
	            int valor=ficheroLectura2.read();
	            while(valor!=-1){
	                System.out.print((char)valor);
	                valor=ficheroLectura2.read();
	            }
	            //Cerramos el stream
	            ficheroLectura2.close();
	        }catch(IOException e){
	            e.printStackTrace();
	        }
	    }
	}


