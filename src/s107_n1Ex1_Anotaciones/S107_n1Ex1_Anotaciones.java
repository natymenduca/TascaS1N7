package s107_n1Ex1_Anotaciones;

public class S107_n1Ex1_Anotaciones {

	public static void main(String[] args) {
        /*se debe crear instancias de las clases Trabajador, TreballadorPresencial y TreballadorOnline, 
		y se debe llamar al método calcularSueldo(int horasTrabajadas) de cada una para demostrar el funcionamiento de la anotación @Override*/
		
	        Trabajador trabajador1 = new Trabajador("Pato", "Kalimero", 35.0);
	        TrabajadorPresencial trabajador2 = new TrabajadorPresencial("Pato", "Lucas", 25.0, 50.0);
	        TrabajadorOnline trabajador3 = new TrabajadorOnline("Pato", "Donall", 25.50);

	        System.out.println(trabajador1.getNombre() + " " + trabajador1.getApellido() + " ha ganado " + trabajador1.calcularSueldo(160) + " euros este mes.");
	        System.out.println(trabajador2.getNombre() + " " + trabajador2.getApellido() + " ha ganado " + trabajador2.calcularSueldo(160) + " euros este mes.");
	        System.out.println(trabajador3.getNombre() + " " + trabajador3.getApellido() + " ha ganado " + trabajador3.calcularSueldo(160) + " euros este mes.");
	};
		 

}
