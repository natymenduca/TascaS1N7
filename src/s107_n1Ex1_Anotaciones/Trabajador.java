package s107_n1Ex1_Anotaciones;
 /*En la clase Trabajador se definen los atributos nombre, apellido y precioHora,
y el método calcularSou() que recibe por parámetro el número de horas trabajadas y lo multiplica por el precio/hora*/
public class Trabajador {
	private String nombre;
	private String apellido;
	private double precioPorHora;


	public Trabajador(String nombre, String apellido, double precioPorHora) {
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
	public void setPrecioPorHora(int precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	/*devuelve el sueldo calculado multiplicando las horas trabajadas x el precio por hora. 
	 * Este método debe ser sobrescrito en las clases hijaspor lo que se debe utilizar la anotación @Override*/ 
	public double calcularSueldo(int horasTrabajadas) {
		return horasTrabajadas * precioPorHora;
	}
	
}
