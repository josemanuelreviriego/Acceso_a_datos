import java.io.BufferedWriter;
import java.io.IOException;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String escribir() {
		return "nombre " + nombre +
				"apellido " + apellidos +
				"edad " + edad;
	}
	
	public void vaciar() {
		nombre="";
		apellidos="";
		edad = 0;
	}
	
	public void escribirFichero(BufferedWriter f)
	{	try {
		f.write(nombre);
		f.newLine();
		f.write(apellidos);
		f.newLine();
		f.write(String.valueOf(edad));
		f.newLine();
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	}

}
