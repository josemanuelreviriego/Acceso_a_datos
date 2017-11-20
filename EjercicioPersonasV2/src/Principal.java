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
	
	public static void escribirFichero(Persona[] listav2)
	{
		try {
			//Creamos un fichero y con el bufferedwriter escribimos en el
			File fichero = new File("FicheroPersona.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			BufferedWriter ficheroBuffer = new BufferedWriter(ficheroEscritura);
			
			//Con el for metemos los datos del array lista en el fichero
			for(int i=0;i<listav2.length;i++)
			{
				ficheroBuffer.write(listav2[i].getNombre());
				ficheroBuffer.newLine();
				ficheroBuffer.write(listav2[i].getApellidos());
				ficheroBuffer.newLine();
				ficheroBuffer.write(String.valueOf(listav2[i].getEdad()));
				ficheroBuffer.newLine();
			}
			//Cerramos el fichero
			ficheroBuffer.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
		
		public static void leerFichero(Persona[] listav1) 
		{
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
					listav1[i].setNombre(ultimo);
					ultimo = ficheroBuffer.readLine();
					listav1[i].setApellidos(ultimo);
					ultimo = ficheroBuffer.readLine();
					listav1[i].setEdad(Integer.parseInt(ultimo));
					ultimo = ficheroBuffer.readLine();
					i++;
				}
				//cerramos el fichero
				ficheroBuffer.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public static void inicializar(Persona[] lista)
		{
			for(int i = 0; i<lista.length; i++)
				lista[i].vaciar();
		}
	
		public static void imprimir(Persona[] lista)
		{
			System.out.println("Contenido de la tabla:");
			for(int i=0;i<lista.length;i++)
			{
				System.out.println("Posicion " + i + " : " + lista[i].escribir());
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int opcion;
		
		/*String[] lista = {
				"Ana", "Gallego", "23",
				"David", "Ups", "20",
				"Miguel", "Marron", "30",
				"Pedro", "Rodriguez", "45",
				"Jonatan","Calvo", "22"
		};*/
		
		Persona[] listav1 = { 
				new Persona("Ana","ruiz",23),
				new Persona("Pepe","Alonso",40),
				new Persona("Ramona","pechugona",15),
				new Persona("dionisia","fernandez",16),
				new Persona("atun","claro",40),
		};
		//Persona[] listaV1 = new Persona[5];
		
		
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
				
				escribirFichero(listav1);
				break;
			case 2:
				leerFichero(listav1);
				
				break;
			case 3:
				inicializar(listav1);
			case 4:
				imprimir(listav1);
				break;
			}
		
		}while(opcion != 5);
		
		
		
	}

}
