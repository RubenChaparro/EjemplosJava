package ejemploExcepciones;

/*En este ejemplo, intentamos crear un objeto FileReader para leer el archivo 
 * "archivo.txt". Si se produce una excepción IOException, el código dentro del 
 * bloque catch se ejecutará y mostrará un mensaje de error.
 */
import java.io.FileReader;
import java.io.IOException;

public class ExcepcionesChecked {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("archivo.txt");
			// hacer algo con el archivo
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
