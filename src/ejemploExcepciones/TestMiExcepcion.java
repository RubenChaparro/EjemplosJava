package ejemploExcepciones;

/* En este ejemplo, intentamos dividir numerador por denominador, pero si denominador 
 * es cero, lanzamos una excepción DivisionPorCeroException. Luego, capturamos esta 
 * excepción en un bloque catch y mostramos el mensaje de error.
 */
public class TestMiExcepcion {
	public static void main(String[] args) {
		int numerador = 10;
		int denominador = 0;

		try {
			if (denominador == 0) {
				throw new MyExcepcion();
			}

			int resultado = numerador / denominador;
			System.out.println("El resultado es: " + resultado);
		} catch (MyExcepcion e) {
			System.out.println(e.getMessage());
		}
	}
}
