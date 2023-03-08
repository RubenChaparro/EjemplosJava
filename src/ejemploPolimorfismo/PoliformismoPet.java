package ejemploPolimorfismo;

/*En este ejemplo, la clase Animal es la clase base o padre que tiene el método moverse(). 
 * La clase Perro y la clase Gato son subclases o hijas de Animal que sobrescriben el 
 * método moverse() para que cada una tenga su propio comportamiento específico. 
 * Cuando se llama al método moverse() en un objeto de la clase Perro, se imprimirá el 
 * mensaje "NombreDelPerro está corriendo." y cuando se llama en un objeto de la clase Gato, 
 * se imprimirá el mensaje "NombreDelGato está saltando."
 */

public class PoliformismoPet {
	private String nombre;

	public PoliformismoPet(String nombre) {
		this.nombre = nombre;
	}

	public void moverse() {
		// método genérico para que cada subclase lo implemente a su manera
	}

	public String getNombre() {
		return nombre;
	}
}
