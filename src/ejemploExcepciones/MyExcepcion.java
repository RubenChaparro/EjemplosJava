package ejemploExcepciones;

/* La clase DivisionPorCeroException hereda de la clase base Exception
 * y define un constructor que llama al constructor de la clase base 
 * con un mensaje de error personalizado.
 */
public class MyExcepcion extends Exception {
	public MyExcepcion() {
		super("No se puede dividir por cero");
	}
}
