package ejemploExcepciones;

/* Por ejemplo, si intentamos dividir un número por cero en Java, se producirá una excepción 
 * ArithmeticException no verificada. No estamos obligados a manejar esta excepción, aunque 
 * es una buena práctica hacerlo en la mayoría de los casos
 */
public class ExcepcionesUnchecked {

	public static void main(String[] args) {
		
	int x = 5;
	int y = 0;
	int z = x / y; // Esto producirá una excepción ArithmeticException no verificada
	
	}
}
