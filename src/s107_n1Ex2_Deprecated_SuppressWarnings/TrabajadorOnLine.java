package s107_n1Ex2_Deprecated_SuppressWarnings;

public class TrabajadorOnLine extends Trabajador {
	
   private static double horasExtras = 2;
    
    public TrabajadorOnLine(String nombre, String apellido, double precioPorHora, double horasExtras ) {
      super();
      TrabajadorOnLine.horasExtras = horasExtras;
    }
    public static double getHorasExtras() {
		return horasExtras;
	}

	public static void setHorasExtras(double horasExtras) {
		TrabajadorOnLine.horasExtras = horasExtras;
	}
    @Override
    public double calcularSueldo(double horasTrabajadas) {
        double sueldoBase = super.calcularSueldo(horasTrabajadas);
        return sueldoBase + (getHorasExtras() * super.getPrecioPorHora());
    }
    
    @Deprecated
    public double calcularSueldoConHorasExtras(double horasTrabajadas) {
        double sueldoBase = super.calcularSueldo(horasTrabajadas);
        return sueldoBase + (getHorasExtras() * super.getPrecioPorHora());
    }

	
}
