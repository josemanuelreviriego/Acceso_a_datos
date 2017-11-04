package metodos;

public class Fecha {
	private int dia, mes, anio;
	
	public Fecha()
	{
		dia = 1;
		mes = 1;
		anio = 2000;
	}
	
	public String escribeCorto()
	{
		return dia +"/" + mes + "/" + anio;
	}

}
