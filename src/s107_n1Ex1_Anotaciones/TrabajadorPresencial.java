package s107_n1Ex1_Anotaciones;

public class TrabajadorPresencial extends Trabajador{
   /*En la clase TreballadorPresencial se define un atributo static llamado gasolina, se sobrescribe el método calcularSou()
	para incluir este atributo, y se utiliza la anotación @Override*/
	
	private static double gasolina; //al ser un atributo estático su valor será compartido por todas las instancias de la clase TrebajadorPresen.

    public TrabajadorPresencial(String nombre, String apellido, double precioHora, double gasolina) {
        super(apellido, apellido, gasolina);
        this.setGasolina(gasolina);
    }
    public static double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		TrabajadorPresencial.gasolina = gasolina;
	}
	/*El método calcularSou() recibe por parámetro el número de horas trabajadas en el mes y 
	en la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora, más el valor de gasolina*/
    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return horasTrabajadas * getPrecioPorHora() + getGasolina();
    }
    
	/*@Deprecated
    public void metodoObsoleto() {
        System.out.println("Este método es obsoleto");
    }

    public TrabajadorPresencial(String string, String string2, double gasolina, int i) {
        super();
        this.gasolina = gasolina;
    }

    private double gasolina;

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        return horasTrabajadas * getPrecioPorHora() + gasolina;
    }*/
}

