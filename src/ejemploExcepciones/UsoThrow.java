package ejemploExcepciones;

/* En este ejemplo, estamos tratando de dividir el número 10 por cero, lo cual provocará 
 * una excepción de ArithmeticException. En el bloque try, estamos llamando al método dividir, 
 * que puede lanzar esta excepción. Si se produce una excepción, se captura en el bloque catch 
 * y se lanza una nueva excepción de RuntimeException utilizando la palabra clave throw. Esta 
 * nueva excepción incluye un mensaje que indica que la división por cero no está permitida.
 */
public class UsoThrow {

	public static void main(String[] args) {

		try {
			// Código que puede lanzar una excepción
			int resultado = dividir(10, 0);
		} catch (ArithmeticException e) {
			// Capturando la excepción y lanzando otra
			throw new RuntimeException("División por cero no permitida");
		}
	}

	public static int dividir(int a, int b) {
		return a / b;
	}
}
