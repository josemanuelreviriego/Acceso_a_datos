package metodos;

public class MetodosClase {

	public static Fecha crearFecha()
	{
		Fecha f = new Fecha();
		return f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha();
		
		System.out.println(f1.escribeCorto());
		
		f1 = crearFecha();
		System.out.println(f1.escribeCorto());
	}

}