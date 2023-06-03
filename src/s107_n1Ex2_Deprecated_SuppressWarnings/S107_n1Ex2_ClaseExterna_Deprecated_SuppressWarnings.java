package s107_n1Ex2_Deprecated_SuppressWarnings;

//se utiliza para suprimir el warning generado por el uso del método obsoleto.
@SuppressWarnings("deprecation")
public class S107_n1Ex2_ClaseExterna_Deprecated_SuppressWarnings {

	public static void main(String[] args) {
		TrebajadorPresencial trabajador2 = new TrebajadorPresencial("Jose", "Gomez", 20, 50);
	    trabajador2.metodoObsoleto();
	}
}	   	



