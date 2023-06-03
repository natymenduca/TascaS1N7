package s107_n1Ex2_Deprecated_SuppressWarnings;

public class Trabajador {

	private String nombre;
	private String apellido;
	private double precioPorHora;


	public void TrabajadorOnLine(String nombre, String apellido, double precioPorHora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioPorHora = precioPorHora;

	}
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public double getPrecioPorHora() {
		return precioPorHora;
	}

	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	/*que devuelve el sueldo calculado multiplicando las horas trabajadas por el precio por hora. Este método debe ser sobrescrito en las clases hijas
		por lo que se debe utilizar la anotación @Override*/ 
	public double calcularSueldo(double horasTrabajadas) {
		return horasTrabajadas * precioPorHora;
	}
	@Override
	public String toString() {
		return "Trabajador{" +
				"Nombre='" + nombre + '\'' +
				", Apellido='" + apellido + '\'' +
				", PrecioPorHora=" + precioPorHora +
				'}';
	}
}

