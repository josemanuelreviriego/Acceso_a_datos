import java.io.*;

public class CrearFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fichero = new File("hola.txt");
		
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
