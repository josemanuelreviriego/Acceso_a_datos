import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuFicheroBuffered {

	public static void imprimirTabla(String[] lista)
	{
		System.out.println("Contenido de la tabla:");
		for(int i=0;i<lista.length;i++)
		{
			System.out.println("Posición " + i + " : " + lista[i]); 
		}
	}	
	
	public static void inicializarTabla(String[] lista)
	{
		for(int i=0;i<lista.length;i++)
		{
			lista[i]="";
		} 
	}
	
	
	public static int elegirOpcionMenu()
	{
		System.out.println("Opciones");
		System.out.println("1. Escribir información - V1 con ;");
		System.out.println("2. Leer información - V1 con ;");
		System.out.println("7. Inicializar tabla nombres");
		System.out.println("8. Escribir tabla nombres");
		System.out.println("9. Fin");
		System.out.println("Introduce opción: ");
        Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.reset();
		return numero;
	}

	public static void escribirFicheroV1(String[] lista)
	{
		try 
		{
			// 1. Crear fichero
			File fichero = new File("FicheroNombresBuffered.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			BufferedWriter ficheroBuffer = new BufferedWriter(ficheroEscritura);
			
			// 2. Escribir nombres
			for(int i=0;i<lista.length;i++)
			{
				ficheroBuffer.write(lista[i]);
				ficheroBuffer.newLine();
			}

			// 3. Cerrar fichero.
			ficheroBuffer.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void leerFicheroV1(String[] lista)
	{
		try 
		{
			// 1. Crear fichero
			File fichero = new File("FicheroNombresBuffered.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			BufferedReader ficheroBuffer = new BufferedReader(ficheroLectura);
						
			// 2. Leer nombres por String, cuando read devuelve null se ha llegado al final del fichero 
			//   
			String linea;
			int i = 0;
			linea = ficheroBuffer.readLine();
			
			while(linea != null) {
				lista[i] = linea;
				i++;
				linea = ficheroBuffer.readLine();
			}
			
			// 3. Cerrar fichero.
			ficheroBuffer.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args)
	{
		String[] lista = {"Pepe", "Ana", "Juan" };

		int opcion;
		do
		{
			opcion = elegirOpcionMenu();
			switch(opcion)
			{
			case 1: // Escribir fichero
				escribirFicheroV1(lista);
				break;
			case 2: // Leer fichero
				leerFicheroV1(lista);
				break;
			case 7: // Inicializar
				inicializarTabla(lista);
				break;
			case 8: // Escribir tabla
				imprimirTabla(lista);
				break;
			}
		}while(opcion!=9);
	}

}
