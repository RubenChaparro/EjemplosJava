package ejemploEncapsulamiento;

public class TestEncapsulamientoPersona {

	public static void main(String[] args) {

		// Crear un objeto Persona y obtener su información
		EncapsulamientoPersona persona = new EncapsulamientoPersona("Juan", 30);
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());

		// Cambiar el nombre y la edad de la Persona
		persona.setNombre("Pedro");
		persona.setEdad(35);
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());

		// Intentar establecer una edad negativa
		persona.setEdad(-10);

	}

}
