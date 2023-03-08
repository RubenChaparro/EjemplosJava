package ejemploMetodoStatic;

public class TestAnimal {

	public static void main(String[] args) {
		// Llamada al método de fábrica
		Animal miAnimal = Animal.crear("Perro");
		miAnimal.hacerSonido(); // Imprime "Guau!"

	}

}
