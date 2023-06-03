package s107_n1Ex2_Deprecated_SuppressWarnings;

public class TrebajadorPresencial extends Trabajador{
	    
		private double gasolina;
		/*el método obsoleto() con la anotación @Deprecated. Luego, se puede invocar este método desde 
		una clase externa y suprimir el warning para ser obsoleto*/
        @Deprecated
	    public void metodoObsoleto() {
	        System.out.println("Este método es obsoleto");
	    }

	    public TrebajadorPresencial(String nombre, String apellido, double precioPorHora, double gasolina) {
	        super();
	        this.gasolina = gasolina;
	    }
	    public double getGasolina() {
			return gasolina;
		}
        public double calcularSueldo(int horasTrabajadas) {
	        return horasTrabajadas * getPrecioPorHora() + gasolina;
	    }
}
