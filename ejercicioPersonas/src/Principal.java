import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	public static int escribirMenu() {
		
		System.out.println("1.Escribe el fichero de la estructura");
		System.out.println("2.Lee el fichero y lo guarda en la estructura");
		System.out.println("3.Escribe por pantalla los datos");
		System.out.println("4.Vacia la estructura");
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		scan.reset();
		return opcion;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcion;
		
		String[] lista = {
				"Ana", "Gallego", "23",
				"David", "Ups", "20",
				"Miguel", "Marron", "30",
				"Pedro", "Rodriguez", "45",
				"Jonatan","Calvo", "22"
		};
		
		
		do {
			opcion = escribirMenu();
			
			/*System.out.println("1.Escribir Fichero");
			System.out.println("2.Leer el fichero");
			System.out.println("3.Escribir por la pantalla");
			System.out.println("4.Vaciar la estructura");
			System.out.println("5.Salir");
			opcion = scan.nextInt();*/
			
			switch(opcion)
			{
			case 1:
				
				try {
					//Creamos un fichero y con el bufferedwriter escribimos en el
					File fichero = new File("FicheroPersona.txt");
					FileWriter ficheroEscritura = new FileWriter(fichero);
					BufferedWriter ficheroBuffer = new BufferedWriter(ficheroEscritura);
					
					//Con el for metemos los datos del array lista en el fichero
					for(int i=0;i<lista.length;i++)
					{
						ficheroBuffer.write(lista[i]);
						ficheroBuffer.newLine();
					}
					//Cerramos el fichero
					ficheroBuffer.close();
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}break;
			case 2:
				
				try {
					//Creamos un fichero y con el BufferReader leemos lo que hay dentro
					File fichero = new File("FicheroPersona.txt");
					FileReader FicheroLectura = new FileReader(fichero);
					BufferedReader ficheroBuffer = new BufferedReader(FicheroLectura);
					
					int i = 0;
					String ultimo;
					ultimo = ficheroBuffer.readLine();
					//Con esto vamos leyendo la lista y cuando llegue a un null es el fin del fichero
					while(ultimo != null) 
					{
						lista[i] = ultimo;
						i++;
						ultimo = ficheroBuffer.readLine();
					}
					//cerramos el fichero
					ficheroBuffer.close();
					
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Contenido de la tabla: ");
				System.out.println("");
				for (int i = 0; i < lista.length; i++)
					System.out.println("Posicion " + i + " : " + lista[i]);
				break;
			case 4:
				for (int i = 0; i < lista.length; i++) {
					lista[i] = "";
			}break;
			}
		
		}while(opcion != 5);
		
		
		
	}

}
