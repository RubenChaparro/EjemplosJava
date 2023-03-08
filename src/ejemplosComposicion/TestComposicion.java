package ejemplosComposicion;

public class TestComposicion {

	public static void main(String[] args) {
		
		// Crear un objeto Coche utilizando un objeto Motor
		ComposicionMotor motor = new ComposicionMotor(4, 150);
		// Al crear un objeto Coche, se debe proporcionar un objeto Motor como argumento del constructor.
		ComposicionCoche coche = new ComposicionCoche("Toyota", "Corolla", motor);

		// Obtener la información del coche y su motor
		// la información del coche y su motor se pueden obtener utilizando los métodos "get" de la clase Coche y Motor.
		System.out.println("Coche: " + coche.getMarca() + " " + coche.getModelo());
		System.out.println("Motor: " + coche.getMotor().getCilindros() + " cilindros, " + coche.getMotor().getPotencia() + " HP");

		/*
		 La composición en Java permite crear objetos complejos y estructuras de datos a partir de objetos 
		 más simples, y es una forma fundamental de diseñar programas orientados a objetos.
		
		*/ 
	
	}

}


