package ejemplosherencia;

/*La clase Estudiante extiende a Persona e introduce una nueva variable de instancia 
 * carrera y un método estudiar() que imprime una cadena con la carrera que está estudiando. 
 * Además, la clase Estudiante sobrescribe el método saludar() de Persona para incluir la 
 * carrera en la cadena que imprime.
 */

public class UsoThisSuperEstudiante extends UsoThisSuperPersona {
	private String carrera;

	public UsoThisSuperEstudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}

	public void estudiar() {
		System.out.println(nombre + " está estudiando " + carrera);
	}

	public void saludar() {
		System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y estudio " + carrera);
	}
}
