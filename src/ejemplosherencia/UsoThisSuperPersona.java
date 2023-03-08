package ejemplosherencia;

/*En este ejemplo, la clase Persona tiene dos variables 
 * de instancia: nombre y edad, y un método saludar() que imprime 
 * una cadena con el nombre y la edad de la persona.
 */
public class UsoThisSuperPersona {

	protected String nombre;
	protected int edad;

	public UsoThisSuperPersona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void saludar() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
	}
}
