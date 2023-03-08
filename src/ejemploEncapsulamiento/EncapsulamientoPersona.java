package ejemploEncapsulamiento;

/* En este ejemplo, la clase Persona tiene dos variables de instancia privadas llamadas "nombre" y "edad". 
 * Estas variables de instancia solo se pueden acceder desde dentro de la clase Persona, pero se puede 
 * acceder a ellas a través de métodos públicos llamados "get" y "set". Los métodos "get" permiten obtener 
 * los valores de las variables de instancia, mientras que los métodos "set" permiten establecer nuevos 
 * valores para estas variables de instancia. La edad está validada para evitar valores negativos 
 * utilizando una excepción.
 */
public class EncapsulamientoPersona {

	private String nombre;
	private int edad;

	public EncapsulamientoPersona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			throw new IllegalArgumentException("La edad debe ser un número positivo");
		}
		this.edad = edad;
	}

}
