package ejemploPolimorfismo;

/* En este ejemplo, la interfaz FiguraGeometrica tiene una constante NOMBRE que se puede acceder desde 
 * cualquier lugar en el código, un método abstracto area() que cualquier clase que implemente la interfaz 
 * debe proporcionar una implementación, un método perimetro() default que se puede sobrescribir en las 
 * clases que implementan la interfaz, y un método estático imprimirNombre() que se puede llamar desde 
 * cualquier lugar en el código sin tener que crear una instancia de una clase que implemente la interfaz.
 * 
 * En resumen, las características de una interfaz incluyen:
 * Constantes que se pueden acceder desde cualquier lugar en el código.
 * Métodos abstractos que cualquier clase que implemente la interfaz debe proporcionar una implementación.
 * Métodos default que se pueden sobrescribir en las clases que implementan la interfaz.
 * Métodos estáticos que se pueden llamar desde cualquier lugar en el código sin tener que crear una instancia 
   de una clase que implemente la interfaz.
 */

public interface InterfazFiguraGeometrica {

	String NOMBRE = "Figura Geométrica"; // Constante de la interfaz

	 double area(); // Método abstracto de la interfaz

	default double perimetro() { // Método default de la interfaz
		return 0.0;
	}

	static void imprimirNombre() { // Método estático de la interfaz
		System.out.println("Nombre de la figura geométrica: " + NOMBRE);
	}
}
