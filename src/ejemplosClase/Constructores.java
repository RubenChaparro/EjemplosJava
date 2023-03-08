package ejemplosClase;

public class Constructores {

	private String nombre;
	private int edad;

	/* Constructor por defecto: En este ejemplo, el constructor por defecto
	 * establece el nombre de la persona en "Sin nombre" y su edad en 0.
	 */

	public Constructores() {
		this.nombre = "Sin nombre";
		this.edad = 0;
	}

	private String nombre1;
	private int edad1;

	/* Constructor con argumentos: En este ejemplo, el constructor con argumentos
	 * toma un nombre y una edad y los utiliza para inicializar los valores de las
	 * variables de instancia de la persona.
	 */
	public Constructores(String nombre, int edad) {
		this.nombre1 = nombre;
		this.edad1 = edad;
	}

	private String nombre2;
	private int edad2;

	/* Constructor copia: En este ejemplo, el constructor copia toma una persona
	 * existente y crea una nueva persona con los mismos valores de nombre y edad.
	 */
	public Constructores(Constructores otraPersona) {
		this.nombre = otraPersona.nombre;
		this.edad = otraPersona.edad;
	}
}
