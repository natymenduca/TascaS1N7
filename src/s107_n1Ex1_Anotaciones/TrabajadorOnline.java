package s107_n1Ex1_Anotaciones;

public class TrabajadorOnline extends Trabajador {
	/*TreballadorOnline se define una constante static final llamada TARIFA_PLAN,
	 *  se sobrescribe el método calcularSou() para incluir esta constante, y se utiliza la anotación @Override */
	
	public static final double TARIFA_INTERNET = 57; /*añadimos la constante TARIFA_PLAN como static final,
	lo que significa que su valor no puede ser modificado y será compartido por todas las instancias de la clase TreballadorOnline*/

	//constructor
	public  TrabajadorOnline(String nombre, String apellido, double precioPorHora) {
		super(apellido, apellido, precioPorHora);

	}
	/*El método recibe por parámetro el número de horas trabajadas en el mes y en la hora de calcular el sueldo
	 se multiplicará el número de horas trabajadas x el precio/hora y se le sumará el precio de la tarifa plana de Internet.*/
	@Override
	public double calcularSueldo(int horasTrabajadas) {
		return super.calcularSueldo(horasTrabajadas) + TARIFA_INTERNET;
	}
    

}


