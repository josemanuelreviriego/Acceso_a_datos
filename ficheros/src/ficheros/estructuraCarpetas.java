package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class estructuraCarpetas {
	
	public static int menu() {
		System.out.println("Opciones");
		System.out.println("1. Crear fichero");
		System.out.println("2. Escribir información");
		System.out.println("3. Comprobar si existe");
		System.out.println("4. Borrar fichero");
		System.out.println("5. Crear arbol de carpetas");
		System.out.println("9. Fin");
		System.out.println("Introduce opción: ");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		scan.reset();
		return numero;
	}
	
	public static void informacion(File f) {
		if(f.exists())
		{
			System.out.println("Informacion:");
			System.out.println("Nombre: " + f.getName());
			System.out.println("Ruta abs: " + f.getAbsolutePath());
			System.out.println("Ruta rel: " + f.getPath());
			System.out.println("  Tamaño: " + f.length());
		}else{
			System.out.println("El fichero no existe");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crear un programa que cree una estructura de carpetas
		 * proyecto -> bin -> bytecode, objetos
		 * 			-> src -> clase
		 * 			-> doc -> html, pdf
		 * 
		 * crear un programa que cree la estructura de ficheros en una tabla de cadenas
		 */
		
		String[] rutas = {
			"Proyecto",
			"Proyecto\\bin",
			"Proyecto\\bin\\bytecode",
			"Proyecto\\bin\\objetos",
			"Proyecto\\src",
			"Proyecto\\src\\clase",
			"Proyecto\\doc",
			"Proyecto\\doc\\html",
			"Proyecto\\doc\\pdf"
		};
		
		Scanner scan = new Scanner(System.in);
		String cadena;
		File fichero;
		int opcion;
		
		do{
			opcion = menu();
			switch(opcion){
			
			case 1:
				System.out.println("Introduce el nombre del fichero");
				cadena = scan.nextLine();
				fichero = new File(cadena);
				try{
					fichero.createNewFile();
				}
				catch(IOException e){
					e.printStackTrace();
				}
				scan.reset();
				System.out.println("Fichero creado");
				break;
			case 2:
				System.out.println("Introduce nombre del fichero:");
				cadena = scan.nextLine();
				fichero = new File(cadena);
				informacion(fichero);
				break;
			case 3:
				System.out.println("Introduce el nombre del fichero:");
				cadena = scan.nextLine();
				fichero = new File(cadena);
				if(fichero.exists())
				{
					System.out.println("Si existe el fichero");
				}else{
					System.out.println("No existe el fichero");
				}
				break;
			case 4:
				System.out.println("Introduce el nombre del fichero:");
				cadena = scan.nextLine();
				fichero = new File(cadena);
				if(fichero.delete()){
					System.out.println("Fichero borrado");
				}else
				{
					System.out.println("Fichero no borrado");
				}
				break;
			case 5:
				System.out.println("Introduce ubicacion:");
				cadena = scan.nextLine();
				fichero = new File(cadena);
				fichero.mkdir();
				fichero = new File(cadena + "\\Proyecto");
				fichero.mkdir();
				fichero = new File(cadena + "\\Proyecto\\bin");
				fichero.mkdir();
				fichero = new File(cadena + "\\Proyecto\\bin\\bytecode");
				fichero.mkdir();
				fichero = new File(cadena + "\\Proyecto\\bin\\objetos");
				fichero.mkdir();
				break;
			case 6:
				System.out.println("Introduce ubicacion:");
				cadena = scan.nextLine();
				fichero = new File(cadena);
				fichero.mkdir();
				for(int i=0;i<rutas.length;i++)
					fichero = new File(cadena + "\\" + rutas[i]);
					fichero.mkdir();
			}
			break;
		}while(opcion != 7);
	}

	}

