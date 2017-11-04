import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PreguntarFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un fichero con el nombre que le demos
		
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		
		System.out.println("El nombre es " + nombre);
		
		File fichero = new File (nombre + ".txt");
		
		try {
			if(fichero.createNewFile() == true)
			{
				System.out.println("El fichero se ha creado");
			}
			else
			{
				System.out.println("El fichero no se ha creado");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
