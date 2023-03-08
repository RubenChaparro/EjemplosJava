package ejemplosherencia;

/*En el método main, se crean objetos de ambas clases y se llama al método saludar() de cada uno. 
 * Luego, se asigna la referencia del objeto de la clase Estudiante a una variable de tipo Persona, 
 * lo que demuestra el polimorfismo. Finalmente, se llama al método saludar() de la variable p, 
 * lo que resulta en la ejecución del método correspondiente de la clase Estudiante.
 */

public class TestUsoThisSuperPersona {

	public static void main(String[] args) {
		UsoThisSuperPersona p = new UsoThisSuperPersona("Juan", 30);
		UsoThisSuperEstudiante e = new UsoThisSuperEstudiante("María", 20, "Ingeniería");

		p.saludar(); // Imprime "Hola, soy Juan y tengo 30 años."
		e.saludar(); // Imprime "Hola, soy María, tengo 20 años y estudio Ingeniería."

		p = e; // Polimorfismo: p ahora hace referencia a un objeto de la clase Estudiante
		p.saludar(); // Imprime "Hola, soy María, tengo 20 años y estudio Ingeniería."
		// Aunque p es de tipo Persona, al llamar al método saludar() se ejecuta el
		// método correspondiente de la clase Estudiante.
	}
}
