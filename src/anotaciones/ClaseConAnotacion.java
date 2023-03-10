package anotaciones;

public class ClaseConAnotacion {

	/*
	 * En este ejemplo, estamos aplicando la anotación "@Test" al método
	 * "testExample" de la clase "MyTest", con una descripción de prueba
	 * "Este es un caso de prueba de ejemplo".
	 */
	@MyAnotacion(description = "Este es un caso de prueba de ejemplo")
	public void testExample() {
		// ...
	}
}
