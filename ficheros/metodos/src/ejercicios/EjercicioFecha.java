package ejercicios;

public class EjercicioFecha {
	int dia = 4,
	mes = 10, 
	anio = 1990;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	String escribeCorta()
	{
		return dia + "/" + mes + "/" + anio;	
	}
	
	String escribeLargo()
	{
		return "Es el dia " + dia + " del mes " + mes + " del año " + anio;
	}
	
	public boolean comprobar()
	{
		if(dia <= 31 && mes <= 12)
			return true;
		return false;
	}
	
	
}
