import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MenuFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear un menu con ficheros
		/* 1. Crear fichero
		 * 2. Mostrar info Fichero nombre, r.absoluta, r.relativa, longitud
		 * 3. mostrar longitud fichero
		 * 4. Comprobar si existe
		 * 5. Borrar fichero
		 */
		System.out.println("Dime que nombre quieres ponerle al fichero");
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Selecciona la opcion que quieres: 1 Crea el fichero 2 Muestra la info 3 muestra la longitud 4 comprueba si existe 5 borra el fichero 9 salir"
				+ "");
		int numero = sc.nextInt();
		
		//while(numero <6) {
		switch(numero) {
		case 1:
			//System.out.println("Dime que nombre quieres ponerle al fichero");
			File fichero = new File(nombre +".txt");
			try {
				if(fichero.createNewFile() == true)
				{
					System.out.println("El fichero se ha creado");
				}
				else
				{
					System.out.println("El fichero no se ha creado");
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case 2:
			fichero = new File(nombre +".txt");
			System.out.println(fichero.getName());
			System.out.println(fichero.getPath());
			System.out.println(fichero.getAbsolutePath());
			System.out.println(fichero.length());
			break;
		case 3:
			fichero = new File(nombre +".txt");
			System.out.println(fichero.length());
			break;
		case 4:
			fichero = new File(nombre +".txt");
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
			break;
		case 5:
			fichero = new File(nombre +".txt");
			fichero.delete();
			break;			
		case 9:
			System.exit(0);
			break;
		}//}
			
		}

	}


