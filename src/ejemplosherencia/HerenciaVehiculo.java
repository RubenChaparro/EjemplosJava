package ejemplosherencia;

/*En este ejemplo, tenemos una clase padre llamada Vehiculo con dos atributos y dos métodos. 
 * Luego, tenemos una clase hija llamada Coche que hereda de la clase Vehiculo y tiene un 
 * atributo y un método adicional. Finalmente, en el método main, creamos un objeto de la 
 * clase Coche, establecemos algunos valores de sus atributos y llamamos a algunos de sus 
 * métodos.Este es un ejemplo básico de herencia en Java, donde la clase hija hereda atributos 
 * y métodos de su clase padre y puede agregar sus propios atributos y métodos adicionales.
 */

// Clase Padre o Superclase
public class HerenciaVehiculo {

	int velocidadMaxima;
	int modelo;

	void arrancar() {
		System.out.println("El vehículo está arrancando...");
	}

	void frenar() {
		System.out.println("El vehículo está frenando...");
	}
}
