package anotaciones;

import java.lang.reflect.Method;

public class TestAnotacion {
	/* Podemos utilizar la reflexión para obtener la anotación aplicada en tiempo de
	 * ejecución, de la siguiente manera:En este ejemplo, estamos obteniendo la
	 * instancia de la clase "MyTest" y luego obteniendo el método "testExample".
	 * Después, estamos obteniendo la anotación "@Test" aplicada al método, y
	 * finalmente estamos imprimiendo el valor del atributo "description" de la
	 * anotación, que es "Este es un caso de prueba de ejemplo".
	 * https://youtu.be/Aogtw26jX18
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<ClaseConAnotacion> clazz = ClaseConAnotacion.class;
		Method testMethod = clazz.getDeclaredMethod("testExample");
		MyAnotacion testAnnotation = testMethod.getAnnotation(MyAnotacion.class);
		System.out.println(testAnnotation.description()); // Imprime "Este es un caso de prueba de ejemplo"
	}
}
