import java.io.File;
import java.util.Scanner;

public class CrearCarpeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear una carpeta con el nombre que le indicamos
		
		Scanner sc = new Scanner(System.in);
		String nombreCarpeta = sc.nextLine();
		
		System.out.println("Tu carpeta se llama " + nombreCarpeta);
		
		File carpeta = new File(nombreCarpeta);
		
		carpeta.mkdirs();
		
		/* Crear un programa que cree una estructura de carpetas
		 * proyecto -> bin -> bytecode, objetos
		 * 			-> src -> clase
		 * 			-> doc -> html, pdf
		 * 
		 * crear un programa que cree la estructura de ficheros en una tabla de cadenas
		 */
	}
	
}
